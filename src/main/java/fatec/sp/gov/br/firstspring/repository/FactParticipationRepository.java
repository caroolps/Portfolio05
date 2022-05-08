package fatec.sp.gov.br.firstspring.repository;

import java.util.List;
import java.lang.Object;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import fatec.sp.gov.br.firstspring.entity.FactParticipation;

public interface FactParticipationRepository extends JpaRepository<FactParticipation, Long> {

	@Query(value = "SELECT * from fact_participation, dim_student_participation WHERE fact_participation.dim_student_std_id = dim_student_participation.std_id ORDER BY acc_elap DESC LIMIT 10", nativeQuery = true)
	public List<FactParticipation> selectData();

}
