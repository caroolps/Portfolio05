package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Student;

public interface StudentService {
	
	public List<Student> getAll();
	
	public Student novoStudent(String name, Integer status);

}
