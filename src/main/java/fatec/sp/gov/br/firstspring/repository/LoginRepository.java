package fatec.sp.gov.br.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Login;
import fatec.sp.gov.br.firstspring.entity.Profile;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends JpaRepository<Login, Long>{
    
    public Login findByEmail(String email);

    //SELECT * from profile, login where profile.login_id = login.id and login.id = 1;

    @Query("SELECT p FROM Profile p JOIN p.login l where l.id = :id")
    Profile getProfileByLoginId(@Param("id") Long id);

}
