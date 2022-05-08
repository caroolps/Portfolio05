package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Time;
import fatec.sp.gov.br.firstspring.repository.TimeRepository;
import fatec.sp.gov.br.firstspring.service.TimeService;

@SpringBootTest
@Transactional
@Rollback
public class TimeRepositoryTest {
	
	@Autowired
	private TimeRepository timeRepo;

	@Autowired
	private TimeService timeService;
	
	@Test
	void contextLoads() {
	}

	@Test
	void findBySemestreTest() {
		
		long a= 5;
		long b= 2021;
		long c= 11;

		Time time = new Time();
		time.setSemestre(a);
		time.setYear(b);
		time.setMonth(c);
		timeRepo.save(time);

		assertNotNull(timeRepo.findBySemestre(a));
	}

	@Test
	void novoTimeTest() {
		
		long a= 6;
		long b= 2021;
		long c= 11;
	
		timeService.novoTime(a, b, c);

		assertNotNull(timeRepo.findBySemestre(b));

	}

}
