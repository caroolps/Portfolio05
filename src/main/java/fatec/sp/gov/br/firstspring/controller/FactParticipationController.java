package fatec.sp.gov.br.firstspring.controller;

import java.util.List;
import java.lang.Object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.dto.GetFactParticipationDTO;
import fatec.sp.gov.br.firstspring.entity.FactParticipation;
import fatec.sp.gov.br.firstspring.service.FactParticipationService;

@RestController
@CrossOrigin
@RequestMapping(value = "/factParticipation")

public class FactParticipationController {
	
	 @Autowired
	    private FactParticipationService factParticipationService;

	    @GetMapping(value = "/all")
	    public List<FactParticipation> getAllFactParticipations(){
	        return factParticipationService.getAll();
	    }

		@GetMapping(value = "/select")
		public List<Object> selectParticipations(){
			return factParticipationService.selectData();
		}

	    // @PostMapping(value = "/filter")
	    // public List<FactParticipation> getFactParticipationByFilter(@RequestBody GetFactParticipationDTO getFactParticipationDTO){
	    //     return factParticipationService.getFactParticipationByFilter(getFactParticipationDTO);
	    // }

}
