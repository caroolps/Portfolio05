package fatec.sp.gov.br.firstspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Student;

public  interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findStudentById(Long studentId);
	
	public Student findByName(String name);
}
