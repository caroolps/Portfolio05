package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	  @Override
	    public List<Student> getAll() {
		     List<Student> students = new ArrayList<Student>();
		        for(Student student: studentRepository.findAll()){
		            students.add(student);
		        }
		        return students;
	    }

	  
	   @Override
	    @Transactional
	    public Student novoStudent(String name, Integer status) {
	    	   	
	    	Student student  = new Student();
	    	student.setName(name);
	    	student.setStatus(status);
	    	
	    	return student;
	    	
	    }
	  
	  
	}