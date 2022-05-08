package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.entity.Time;
import fatec.sp.gov.br.firstspring.repository.TimeRepository;

@Service("timeService")
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeRepository timeRepository;

	  @Override
	    public List<Time> getAll() {
	        List<Time> times = new ArrayList<Time>();
	        for(Time time: timeRepository.findAll()){
	            times.add(time);
	        }
	        return times;
	    }
	  
	  @Override
	    @Transactional
	    public Time novoTime(Long semestre, Long year, Long month) {
	    	   	
	    	Time time  = new Time();
	    	time.setSemestre(semestre);
	    	time.setYear(year);
	    	time.setMonth(month);
	    	return time;

	}
	  
}