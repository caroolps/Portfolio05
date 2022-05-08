package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Performance;

public interface PerformanceService {

    public List<Performance> getAll();

    public Performance getPerformanceByProfileId(Long profileId);
    
    public Performance novoPerformance(String course,  Double grade, Integer parClasses, Integer totClasses);
    
}
