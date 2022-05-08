package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Time;

public interface TimeService {
	
	public List<Time> getAll();

	public Time novoTime(Long semestre, Long year, Long month);
}
