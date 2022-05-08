package fatec.sp.gov.br.firstspring.service;

import java.util.List;
import java.lang.Object;

import fatec.sp.gov.br.firstspring.dto.GetFactParticipationDTO;
import fatec.sp.gov.br.firstspring.entity.FactParticipation;

public interface FactParticipationService {
	
	public List<FactParticipation> getAll();

	public List<Object> selectData();
	// public List<FactParticipation> getFactParticipationByFilter(GetFactParticipationDTO getFactParticipationDto);

}
