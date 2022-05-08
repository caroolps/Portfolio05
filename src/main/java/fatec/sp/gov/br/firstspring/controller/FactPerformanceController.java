package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.dto.GetFactPerformanceDTO;
import fatec.sp.gov.br.firstspring.entity.FactPerformance;
import fatec.sp.gov.br.firstspring.service.FactPerformanceService;

@RestController
@CrossOrigin
@RequestMapping(value = "/factPerformance")

public class FactPerformanceController {
	
    @Autowired
    private FactPerformanceService factPerformanceService;

    @GetMapping(value = "/all")
    public List< FactPerformance> getAllFactPerformances(){
        return factPerformanceService.getAll();
    }

    @PostMapping(value = "/filter")
    public List<FactPerformance> getFactPerformanceByFilter(@RequestBody GetFactPerformanceDTO getFactPerformanceDTO){
        return factPerformanceService.getFactPerformanceByFilter(getFactPerformanceDTO);
    }

    @GetMapping(value = "/select")
    public List<Object> selectPerformance(@RequestParam(value = "order") String order){
        return factPerformanceService.selectData(order);
    }

}

