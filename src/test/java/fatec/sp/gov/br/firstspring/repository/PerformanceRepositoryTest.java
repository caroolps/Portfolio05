package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Performance;
import fatec.sp.gov.br.firstspring.repository.PerformanceRepository;
import fatec.sp.gov.br.firstspring.service.PerformanceService;

// @SpringBootTest
// @Transactional
// @Rollback
public class PerformanceRepositoryTest {
	
	// @Autowired
	// private PerformanceRepository performanceRepo;
	
	// @Autowired
	// private PerformanceService performanceService;
	
	@Test
	void contextLoads() {
	}

	@Test
	void findByCourseTest() {
        int a = 7; 
        int b = 7;
        double c = 7.5;
		Performance performance = new Performance ();
		performance.setCourse("HTML5");
		performance.setGrade(c);
		performance.setParClasses(a);
		performance.setTotClasses(b);
		// performanceRepo.save(performance);

		// assertNotNull(performanceRepo.findByCourse("HTML5"));
		assertNotNull(performance.getCourse());
		
	}
	
	// @Test
	// void carregarCursoPeloNome() {
	// 	String course = "teste";
	// 	Performance performance = performanceRepo.findByCourse(course);
	// 	assertNotNull(course);
	// 	assertEquals(course, performance.getCourse());
	// }
	
	// @Test
	// void novoPerformanceTest() {
	// 	double a = 7.5;
	// 	int b = 7;
	// 	int c = 7; 
	//     performanceService.novoPerformance("Ingles2", a , b, c );
	// 	assertNotNull(performanceRepo.findByCourse("ingles2"));

	// }
}
