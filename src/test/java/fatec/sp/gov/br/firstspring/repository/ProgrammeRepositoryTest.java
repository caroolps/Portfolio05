package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Programme;
import fatec.sp.gov.br.firstspring.repository.ProgrammeRepository;
import fatec.sp.gov.br.firstspring.service.ProgrammeService;

@SpringBootTest
@Transactional
@Rollback
public class ProgrammeRepositoryTest {
	
	@Autowired
	private ProgrammeRepository programmeRepo;

	@Autowired
	private ProgrammeService programmeService;
	
	@Test
	void contextLoads() {
	}

	@Test
	void findByDescriptionTest() {
		
		Programme programme = new Programme();
		programme.setName("teste");
		programme.setDescription("teste");
		programmeRepo.save(programme);

		assertNotNull(programmeRepo.findByDescription("teste"));

	}
	
	@Test
	void novoProgrammeTest() {
		
		programmeService.novoProgramme("teste", "teste");

		assertNotNull(programmeRepo.findByDescription("teste"));

	}
	
}










