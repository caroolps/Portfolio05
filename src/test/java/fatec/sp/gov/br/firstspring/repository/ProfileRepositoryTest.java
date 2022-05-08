package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.HashSet;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import fatec.sp.gov.br.firstspring.entity.Auth;
import fatec.sp.gov.br.firstspring.entity.Login;
import fatec.sp.gov.br.firstspring.entity.Profile;
import fatec.sp.gov.br.firstspring.repository.AuthRepository;
import fatec.sp.gov.br.firstspring.repository.LoginRepository;
import fatec.sp.gov.br.firstspring.repository.ProfileRepository;

@SpringBootTest
@Transactional
@Rollback
public class ProfileRepositoryTest {
    
    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private AuthRepository authRepository;

    @Test
    void profileRepositorySaveProfileWithLoginOk(){

        Auth auth = new Auth();
        auth.setPermission("teste12346");
        authRepository.save(auth);

        Login login = new Login();
        login.setEmail("login@login.comm");
        login.setPassword("teste123");
        login.setAuthorizations(new HashSet<Auth>());
		login.getAuthorizations().add(auth);
		loginRepository.save(login);

        Profile profile = new Profile();
        profile.setLogin(login);
        profile.setName("Teste");
        profile.setDoc("111.111.111-11");
        profile.setGender("Masculino");
        profile.setBirthday(new Date(1220227200L * 1000));
        profile.setPhone("(12) 2121-2121");
        profile.setMobile("(12) 1 2121-2121");
        profileRepository.save(profile);

        assertNotNull(profile.getId());

    }

    @Test
    void profileRepositoryFindProfileByLoginEmailOk(){

        Login login = loginRepository.findByEmail("admin");
        Profile profile = profileRepository.findProfileByLoginEmail(login.getEmail());
        assertNotNull(profile.getId());

    }

    

}
