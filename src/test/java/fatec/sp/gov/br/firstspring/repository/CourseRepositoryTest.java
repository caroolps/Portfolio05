package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Course;
import fatec.sp.gov.br.firstspring.repository.CourseRepository;
import fatec.sp.gov.br.firstspring.service.CourseService;

@SpringBootTest
@Transactional
@Rollback
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepo;

	@Autowired
	private CourseService courseService;

	@Test
	void contextLoads() {
	}

	@Test
	void findByAvaliacaoTest() {

		Course course = new Course();
		course.setName("teste");
		course.setAvaliacao("teste");
		courseRepo.save(course);

		assertNotNull(courseRepo.findByAvaliacao("teste"));
	}

	@Test
	void novoCourseTest() {
	
		courseService.novoCourse("course", "teste");

		assertNotNull(courseRepo.findByAvaliacao("teste"));

	}
}
