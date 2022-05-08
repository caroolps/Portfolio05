package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Programme;
import fatec.sp.gov.br.firstspring.repository.ProgrammeRepository;

@Service("programmeService")
public class ProgrammeServiceImpl implements ProgrammeService {

	@Autowired
	private ProgrammeRepository programmeRepository;

	@Override
	public List<Programme> getAll() {
		List<Programme> programmes = new ArrayList<Programme>();
		for (Programme programme : programmeRepository.findAll()) {
			programmes.add(programme);
		}
		return programmes;
	}

	@Override
	@Transactional
	public Programme novoProgramme(String name, String description) {

		Programme programme = new Programme();
		programme.setName(name);
		programme.setDescription(description);
		programmeRepository.save(programme);

		return programme;
	}
}