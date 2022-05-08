package fatec.sp.gov.br.firstspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Programme;

public interface ProgrammeRepository extends JpaRepository<Programme, Long> {
	
	public List<Programme> findProgrammeById(Long programmeId);
	
	 public Programme findByDescription(String description);
}
