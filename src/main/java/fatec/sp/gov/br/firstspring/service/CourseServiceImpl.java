package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Course;
import fatec.sp.gov.br.firstspring.repository.CourseRepository;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	   @Autowired
	    private CourseRepository courseRepository;

	    @Override
	    public List<Course> getAll() {
	        List<Course> courses = new ArrayList<Course>();
	        for(Course course: courseRepository.findAll()){
	            courses.add(course);
	        }
	        return courses;
	    }
	    @Override
	    @Transactional
	    public Course novoCourse(String name, String avaliacao) {
	    	   	
	    	Course course  = new Course();
	    	course.setName(name);
	    	course.setAvaliacao(avaliacao);
	    		    	
	    	return course;
	    	
	    }
}