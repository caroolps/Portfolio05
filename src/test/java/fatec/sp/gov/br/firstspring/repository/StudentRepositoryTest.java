package fatec.sp.gov.br.firstspring.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.repository.StudentRepository;
import fatec.sp.gov.br.firstspring.service.StudentService;

@SpringBootTest
@Transactional
@Rollback
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private StudentService studentService;

	@Test
	void contextLoads() {
	}

	@Test
	void findByNameTest() {
		int a = 7;
		Student student = new Student();
		student.setName("teste");
		student.setStatus(a);
		studentRepo.save(student);

		assertNotNull(studentRepo.findByName("teste"));

	}

	@Test
	void novoStudentTest() {
		int a = 7;

		studentService.novoStudent("teste", a);

		assertNotNull(studentRepo.findByName("teste"));

	}

}
