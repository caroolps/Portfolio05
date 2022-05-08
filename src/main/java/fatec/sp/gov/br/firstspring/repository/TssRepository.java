package fatec.sp.gov.br.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fatec.sp.gov.br.firstspring.entity.Tss;

public interface TssRepository extends JpaRepository<Tss, Long> {
    
    // @Query("SELECT AVG(tssAvgMin) as tssAvgMin, AVG(tssExpPlat) as tssExpPlat, AVG(tssExpContent) as tssExpContent FROM Tss")
    
    // @Query("SELECT p FROM Profile p JOIN p.login l where l.id = :id")

    
    // @Query("SELECT AVG(tssAvgMin) as tssAvgMin, AVG(tssExpPlat) as tssExpPlat, AVG(tssExpContent) as tssExpContent FROM Tss")
    @Query("SELECT t FROM Tss t WHERE t.id = 1")
    public Tss getAllTssAvgData();
    
    public Tss findByTssAvgMin (Integer tssAvgMin );

}
