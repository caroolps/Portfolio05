package fatec.sp.gov.br.firstspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Time;


public interface TimeRepository extends JpaRepository<Time, Long> {
	
	public List<Time> findTimeById(Long timeId);
	
	public Time findBySemestre(Long semestre);

}
