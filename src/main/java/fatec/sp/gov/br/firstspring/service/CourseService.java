package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Course;

public interface CourseService {

	 public List<Course> getAll();
	 
	 public Course novoCourse(String name, String avaliacao);

}
