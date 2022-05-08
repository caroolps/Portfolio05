package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Course;
import fatec.sp.gov.br.firstspring.service.CourseService;

@RestController
@CrossOrigin
@RequestMapping(value = "/crs")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping(value = "/all")
	public List<Course> getAllCourses() {
		return courseService.getAll();
	}

}
