package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import fatec.sp.gov.br.firstspring.dto.GetFactPerformanceDTO;
import fatec.sp.gov.br.firstspring.entity.FactPerformance;
import fatec.sp.gov.br.firstspring.repository.FactPerformanceRepository;
import fatec.sp.gov.br.firstspring.specification.FactPerformanceSpecification;

@Service("factPerformanceService")
public class FactPerformanceServiceImpl implements FactPerformanceService {

    @Autowired
    private FactPerformanceRepository factPerformanceRepository;

    @Override
    public List<FactPerformance> getAll() {
        List<FactPerformance> factPerformances = new ArrayList<FactPerformance>();
        for (FactPerformance factPerformance : factPerformanceRepository.findAll()) {
            factPerformances.add(factPerformance);
        }
        return factPerformances;
    }

    @Override
    public List<FactPerformance> getFactPerformanceByFilter(GetFactPerformanceDTO getFactPerformanceDTO) {

        if (getFactPerformanceDTO.getGrade() == null) {
            getFactPerformanceDTO.setGrade(null);
        }

        // if(getFactPerformanceDTO.getProgramme() == null){
        // getFactPerformanceDTO.setProgramme(null);
        // }

        // if(getFactPerformanceDTO.getCourse() == null){
        // getFactPerformanceDTO.setCourse(null);
        // }

        // if(getFactPerformanceDTO.getStudent() == null){
        // getFactPerformanceDTO.setStudent(null);
        // }

        // if(getFactPerformanceDTO.getTime() == null){
        // getFactPerformanceDTO.setTime(null);
        // }

        List<FactPerformance> factPerformances = new ArrayList<FactPerformance>();
        for (FactPerformance fact : factPerformanceRepository
                .findAll(Specification.where(FactPerformanceSpecification.grade(getFactPerformanceDTO.getGrade())
                        .and(FactPerformanceSpecification.idProgramme(getFactPerformanceDTO.getProgramme()))
                        .and(FactPerformanceSpecification.idCourse(getFactPerformanceDTO.getCourse()))
                        .and(FactPerformanceSpecification.idStudent(getFactPerformanceDTO.getStudent()))
                        .and(FactPerformanceSpecification.Year(getFactPerformanceDTO.getTime()))
                        .and(FactPerformanceSpecification.Semester(getFactPerformanceDTO.getTime()))
                // .and(FactPerformanceSpecification.idTime(getFactPerformanceDTO.getTime()))
                ))) {
            factPerformances.add(fact);
        }

        // List<FactPerformance> factPerformances = ;
        return factPerformances;
    }

    @Override
    public List<Object> selectData(String order) {
        List<Object> factPerformances = new ArrayList<Object>();

        if (order.equals("ASC")) {
            for (Object factPerformance : factPerformanceRepository.selectDataAsc(order)) {
                factPerformances.add(factPerformance);
            }
            return factPerformances;
        }

        if (order.equals("DESC")) {
            for (Object factPerformance : factPerformanceRepository.selectDataDesc(order)) {
                factPerformances.add(factPerformance);
            }
            return factPerformances;
        }

        return factPerformances;
    }

}
