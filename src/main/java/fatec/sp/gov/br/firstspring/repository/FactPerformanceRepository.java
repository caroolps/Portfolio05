package fatec.sp.gov.br.firstspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import fatec.sp.gov.br.firstspring.entity.FactPerformance;

public interface FactPerformanceRepository extends JpaRepository<FactPerformance, Long>, JpaSpecificationExecutor<FactPerformance> {

    @Query("SELECT p FROM FactPerformance p")
    public List<FactPerformance> findByFactPerformance(Float grade, Long idProgramme, Long idCourse, Long idStudent, Long idTime);

    @Query(value = "SELECT * from fact_performance, dim_student_participation WHERE fact_performance.std_id = dim_student_participation.std_id ORDER BY pfc_std_grade ASC LIMIT 10", nativeQuery = true)
	public List<FactPerformance> selectDataAsc(String order);

    @Query(value = "SELECT * from fact_performance, dim_student_participation WHERE fact_performance.std_id = dim_student_participation.std_id ORDER BY pfc_std_grade DESC LIMIT 10", nativeQuery = true)
	public List<FactPerformance> selectDataDesc(String order);

}
