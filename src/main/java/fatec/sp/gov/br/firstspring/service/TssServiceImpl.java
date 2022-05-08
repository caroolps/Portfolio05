package fatec.sp.gov.br.firstspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Tss;
import fatec.sp.gov.br.firstspring.repository.TssRepository;

@Service("tssService")
public class TssServiceImpl implements TssService {

    @Autowired
    private TssRepository tssRepository;

    @Override
    public Tss getTssAvgData() {
        Tss tssAvgData = tssRepository.getAllTssAvgData();
        return tssAvgData;
    }

    // @Override
    // public List<Activation> getAll() {
    //     List<Activation> activations = new ArrayList<Activation>();
    //     for(Activation activation: activationRepository.findAll()){
    //         activations.add(activation);
    //     }
    //     return activations;
    // }

    @Override
    @Transactional
    public Tss novoTss(Integer tssAvgMin, Double tssExpPlat, Integer tssAvgPlat, Double tssExpContent) {
    	   	
    	Tss tss  = new Tss();
    	tss.setTssAvgMin(tssAvgMin);
    	tss.setTssExpPlat(tssExpPlat);
    	tss.setTssAvgPlat(tssAvgPlat);
    	tss.setTssExpContent(tssExpContent);
    	return tss;
    
}
    
}
