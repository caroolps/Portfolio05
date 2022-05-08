package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Programme;

public interface ProgrammeService {

	public List<Programme> getAll();

	public Programme novoProgramme(String name, String description);
}
