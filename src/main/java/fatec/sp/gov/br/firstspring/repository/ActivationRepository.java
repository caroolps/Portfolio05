package fatec.sp.gov.br.firstspring.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import fatec.sp.gov.br.firstspring.entity.Activation;

public interface ActivationRepository extends JpaRepository<Activation, Long>, JpaSpecificationExecutor<Activation> {

    @Query("SELECT a FROM Activation a")
    public List<Activation> findByActNumUsrActSemestreActSemYear(Integer usr, Integer sem, LocalDate year);
    
}
