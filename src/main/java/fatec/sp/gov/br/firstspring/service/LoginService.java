package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import fatec.sp.gov.br.firstspring.entity.Auth;
import fatec.sp.gov.br.firstspring.entity.Login;
import fatec.sp.gov.br.firstspring.entity.Profile;

public interface LoginService extends UserDetailsService {

    public List<Login> getAll();

    public Login getLoginById(Long id);

    public Profile getProfileByLoginId(Long id);

    public Login getLoginByEmail(String email);

    public Login postLogin(Login login);

    public Login putLogin(Login login);

    public void deleteLoginById(Long id);

    public Auth getAuthorizationsById(Long id);

}
