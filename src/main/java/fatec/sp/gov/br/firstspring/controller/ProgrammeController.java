package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Programme;
import fatec.sp.gov.br.firstspring.service.ProgrammeService;


@RestController
@CrossOrigin
@RequestMapping(value = "/prg")
public class ProgrammeController {
	
	   @Autowired
	    private ProgrammeService programmeService;
	    
	   @GetMapping(value = "/all")
	    public List<Programme> getAllProgrammes(){
	        return programmeService.getAll();
	    }

}