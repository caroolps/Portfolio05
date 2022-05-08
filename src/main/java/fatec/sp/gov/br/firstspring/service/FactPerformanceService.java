package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.dto.GetFactPerformanceDTO;
import fatec.sp.gov.br.firstspring.entity.FactPerformance;

public interface FactPerformanceService {

	public List<FactPerformance> getAll();

	public List<FactPerformance> getFactPerformanceByFilter(GetFactPerformanceDTO getFactPerformanceDto);

	public List<Object> selectData(String order);
}
