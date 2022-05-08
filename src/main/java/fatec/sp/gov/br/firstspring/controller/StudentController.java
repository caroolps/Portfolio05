package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping(value = "/all")
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

}