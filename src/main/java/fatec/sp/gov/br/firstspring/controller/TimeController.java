package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Time;
import fatec.sp.gov.br.firstspring.service.TimeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/tim")
public class TimeController {

    @Autowired
    private TimeService timeService;
    
    @GetMapping(value = "/all")
    public List<Time> getAllTimes(){
        return timeService.getAll();
    }

}
