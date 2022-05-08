package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Tss;
import fatec.sp.gov.br.firstspring.service.TssService;

@SpringBootTest
@Transactional
@Rollback
public class TssRepositoryTest {
	
	@Autowired
	private TssRepository tssRepo;

	@Autowired
	private TssService tssService;
	
	@Test
	void findByTssAvgMinTest() {
		
		int a= 5;
		double b= 2021;
		int c= 11;
		double d= 1.2;
		
		Tss tss = new Tss();
		tss.setTssAvgMin(a);
		tss.setTssExpPlat(b);
		tss.setTssAvgPlat(c);
		tss.setTssExpContent(d);
		tssRepo.save(tss);

		assertNotNull(tssRepo.findByTssAvgMin(a));
	}
	
	@Test
	void novoTssTest() {
		
		int a= 6;
		double b= 2.0;
		int c= 11;
		double d= 1.2;
	
		tssService.novoTss(a, b, c, d);

		assertNotNull(tssRepo.findByTssAvgMin(a));

	}


}
