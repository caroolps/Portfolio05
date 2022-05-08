package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.dto.ActivationDto;
import fatec.sp.gov.br.firstspring.entity.Activation;

public interface ActivationService {

    public List<Activation> getAll();

    public List<Activation> getActivationByFilter(ActivationDto activationDto);
    
}
