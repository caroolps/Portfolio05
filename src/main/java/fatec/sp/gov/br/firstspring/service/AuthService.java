package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Auth;

public interface AuthService {
    
    public List<Auth> getAll();

    public Auth getAuthByName(String permission);

}
