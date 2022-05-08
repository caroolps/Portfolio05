package fatec.sp.gov.br.firstspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    
    public Auth findByPermission(String permission);

    public List<Auth> findByLoginsEmail(String email); //return a list of authorizations

}
