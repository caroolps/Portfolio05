package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import fatec.sp.gov.br.firstspring.dto.GetFactParticipationDTO;
import fatec.sp.gov.br.firstspring.entity.FactParticipation;
import fatec.sp.gov.br.firstspring.repository.FactParticipationRepository;
import fatec.sp.gov.br.firstspring.specification.FactParticipationSpecification;

@Service("factParticipationService")
public class FactParticipationServiceImpl implements FactParticipationService {
	
	@Autowired
    private FactParticipationRepository factParticipationRepository;

    @Override
    public List<FactParticipation> getAll() {
        List<FactParticipation> factParticipations = new ArrayList<FactParticipation>();
        for(FactParticipation factParticipation: factParticipationRepository.findAll()){
        	factParticipations.add(factParticipation);
        }
        return factParticipations;
    }

    @Override
    public List<Object> selectData() {
        List<Object> factParticipations = new ArrayList<Object>();
        for(Object factParticipation: factParticipationRepository.selectData()){
        	factParticipations.add(factParticipation);
        }
        return factParticipations;
    }

    // @Override
    // public List<FactParticipation> getFactParticipationByFilter(GetFactParticipationDTO getFactParticipationDTO) {

    //     if(getFactParticipationDTO.getElap() == null){
    //     	getFactParticipationDTO.setElap(null);
    //     }
        
    //     if(getFactParticipationDTO.getAsg() == null){
    //     	getFactParticipationDTO.setAsg(null);
    //     }
        
    //     if(getFactParticipationDTO.getDlr() == null){
    //     	getFactParticipationDTO.setDlr(null);
    //     }

    //     List<FactParticipation> factParticipations = new ArrayList<FactParticipation>();
    //     for(FactParticipation fact: factParticipationRepository.findAll(
    //         Specification.where(
    //         		FactParticipationSpecification.elap(getFactParticipationDTO.getElap())
    //         	.and(FactParticipationSpecification.dlr(getFactParticipationDTO.getDlr()))
    //             .and(FactParticipationSpecification.asg(getFactParticipationDTO.getAsg()))
    //             .and(FactParticipationSpecification.idAssigments(getFactParticipationDTO.getAssigments()))
    //             .and(FactParticipationSpecification.idClassOf(getFactParticipationDTO.getClassOf()))
    //             .and(FactParticipationSpecification.idStudent(getFactParticipationDTO.getStudent()))
              
    //         ))){
    //         factParticipations.add(fact);
    //     }

    //     return factParticipations;
    // }

}


