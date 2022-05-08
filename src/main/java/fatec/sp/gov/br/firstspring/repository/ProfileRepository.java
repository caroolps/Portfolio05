package fatec.sp.gov.br.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    public Profile findProfileByLoginEmail(String email);

}
