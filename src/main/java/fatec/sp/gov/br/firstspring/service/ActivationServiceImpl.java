package fatec.sp.gov.br.firstspring.service;

import fatec.sp.gov.br.firstspring.dto.ActivationDto;
import fatec.sp.gov.br.firstspring.entity.Activation;
import fatec.sp.gov.br.firstspring.repository.ActivationRepository;
import fatec.sp.gov.br.firstspring.specification.ActivationSpecification;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service("activationService")
public class ActivationServiceImpl implements ActivationService {

    @Autowired
    private ActivationRepository activationRepository;

    @Override
    public List<Activation> getAll() {
        List<Activation> activations = new ArrayList<Activation>();
        for(Activation activation: activationRepository.findAll()){
            activations.add(activation);
        }
        return activations;
    }

    @Override
    public List<Activation> getActivationByFilter(ActivationDto activationDto) {

        if(activationDto.getUsr() == null){
            activationDto.setUsr(0);
        }

        if(activationDto.getSem() == null){
            activationDto.setSem(null);
        }

        if(activationDto.getYear() == null){
            LocalDate year = LocalDate.ofYearDay(1900, 1);
            activationDto.setYear(year);
        }

        List<Activation> activations = activationRepository.findAll(
            Specification.where(
                ActivationSpecification.usr(activationDto.getUsr())
                .and(ActivationSpecification.sem(activationDto.getSem()))
                .and(ActivationSpecification.year(activationDto.getYear()))
            ));
        return activations;
    }

}
