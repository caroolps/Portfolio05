package fatec.sp.gov.br.firstspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.sp.gov.br.firstspring.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	  public List<Course> findCourseById(Long courseId);
	  
	  public Course findByAvaliacao(String avaliacao);

}
