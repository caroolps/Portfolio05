package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Performance;
import fatec.sp.gov.br.firstspring.repository.PerformanceRepository;

@Service("performanceService")
public class PerformanceServiceImpl implements PerformanceService {

    @Autowired
    private PerformanceRepository performanceRepository;

    @Override
    public List<Performance> getAll() {
        List<Performance> performances = new ArrayList<Performance>();
        for(Performance performance: performanceRepository.findAll()){
            performances.add(performance);
        }
        return performances;
    }

    @Override
    public Performance getPerformanceByProfileId(Long profileId) {
        Optional<Performance> performance = performanceRepository.findById(profileId);
        if(performance.isPresent()){
            return performance.get();
        }
        throw new RuntimeException("User not found");
    }
    
    @Override
    @Transactional
    public Performance novoPerformance(String course,  Double grade, Integer parClasses, Integer totClasses) {
    	   	
    	Performance performance  = new Performance();
    	performance.setCourse(course);
    	performance.setGrade(grade);
    	performance.setParClasses(parClasses);
    	performance.setTotClasses(totClasses);
    	performanceRepository.save(performance);
    	
    	return performance;
    	
    }
    
}
