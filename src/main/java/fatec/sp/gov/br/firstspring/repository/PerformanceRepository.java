package fatec.sp.gov.br.firstspring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import fatec.sp.gov.br.firstspring.entity.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {

    public List<Performance> findPerformanceById(Long performaceId);
    
    public Performance findByCourse(String course);
    
}
