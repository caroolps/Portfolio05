package fatec.sp.gov.br.firstspring.controller;

import java.lang.reflect.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Tss;
import fatec.sp.gov.br.firstspring.service.TssService;

@RestController
@CrossOrigin
@RequestMapping(value = "/tss")
public class TssController {

    @Autowired
    private TssService tssService;
    
    @GetMapping(value = "/avgData")
    public Tss getTssAvgDataTest(){
        Tss result = tssService.getTssAvgData();
        return result;
    }

}
