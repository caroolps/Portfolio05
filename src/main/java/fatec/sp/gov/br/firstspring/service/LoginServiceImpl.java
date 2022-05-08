package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fatec.sp.gov.br.firstspring.entity.Auth;
import fatec.sp.gov.br.firstspring.entity.Login;
import fatec.sp.gov.br.firstspring.entity.Profile;
import fatec.sp.gov.br.firstspring.repository.AuthRepository;
import fatec.sp.gov.br.firstspring.repository.LoginRepository;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public Auth getAuthorizationsById(Long id) {
        Auth auth = authRepository.getById(id);
        if(auth != null){
            return auth;
        }
        throw new RuntimeException("Authrozation not found");
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public Login getLoginByEmail(String email) {
        Login login = loginRepository.findByEmail(email);
        if(login != null){
            return login;
        }
        throw new RuntimeException("User not found");
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public Login getLoginById(Long id) {
        Optional<Login> login = loginRepository.findById(id);
        if(login.isPresent()){
            return login.get();
        }
        throw new RuntimeException("User not found");
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public List<Login> getAll() {
        List<Login> logins = new ArrayList<Login>();
        for(Login login: loginRepository.findAll()){
            logins.add(login);
        }
        return logins;
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public Login postLogin(Login login) {

        Auth auth = authRepository.findByPermission("ROLE_USER");

        login.setEmail(login.getEmail());
		login.setPassword(passwordEncoder.encode(login.getPassword()));
		login.setAuthorizations(new HashSet<Auth>());
		login.getAuthorizations().add(auth);
        loginRepository.save(login);

        Login newLogin = loginRepository.getById(login.getId());

        if(newLogin != null){
            return newLogin;
        }

        throw new RuntimeException("User can't be save");

    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public Login putLogin(Login newLogin) {

        Login login = loginRepository.getById(newLogin.getId());

        login.setId(newLogin.getId());
        login.setEmail(newLogin.getEmail());
        if(newLogin.getPassword() != null){
            login.setPassword(passwordEncoder.encode(newLogin.getPassword()));
        }

        //TODO Update authorization List;
        // login.setAuthorizations(new HashSet<Auth>(newLogin.getAuthorizations()));

        try{
            loginRepository.save(login);
            Login updatedLogin = loginRepository.getById(login.getId());
            return updatedLogin;
        }catch(Exception e){
            throw new RuntimeException("User can't be save");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Login login = loginRepository.findByEmail(email);

        if(login == null){
            throw new UsernameNotFoundException("User " + email + "not found.");
        }
        
        /**
         * Set Login data in Spring boot User
         */

        return User.builder().username(email).password(login.getPassword())
        .authorities(login.getAuthorizations().stream()
            .map(Auth::getPermission).collect(Collectors.toList())
            .toArray(new String[login.getAuthorizations().size()]))
        .build();

    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteLoginById(Long id) {
        loginRepository.deleteById(id);
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public Profile getProfileByLoginId(Long id) {
        Profile profile = loginRepository.getProfileByLoginId(id);
        if(profile != null){
            return profile;
        }
        throw new RuntimeException("User not found");
    }
    
}
