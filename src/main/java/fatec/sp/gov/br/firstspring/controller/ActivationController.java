package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.dto.ActivationDto;
import fatec.sp.gov.br.firstspring.entity.Activation;
import fatec.sp.gov.br.firstspring.service.ActivationService;

@RestController
@CrossOrigin
@RequestMapping(value = "/activation")
public class ActivationController {

    @Autowired
    private ActivationService activationService;

    @GetMapping(value = "/all")
    public List<Activation> getAllActivationss(){
        return activationService.getAll();
    }

    @PostMapping(value = "/filter")
    public List<Activation> getActivationByFilter(@RequestBody ActivationDto activationDto){
        return activationService.getActivationByFilter(activationDto);
    }

}
