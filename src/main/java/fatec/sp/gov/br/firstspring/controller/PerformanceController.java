package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Performance;
import fatec.sp.gov.br.firstspring.service.PerformanceService;

@RestController
@CrossOrigin
@RequestMapping(value = "/performance")
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService;
    
    @GetMapping(value = "/all")
    public List<Performance> getAllPerformances(){
        return performanceService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Performance getPerfomance(@PathVariable("id") long id){
        return performanceService.getPerformanceByProfileId(id);
    }

}
