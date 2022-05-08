package fatec.sp.gov.br.firstspring.service;

import fatec.sp.gov.br.firstspring.entity.Tss;

public interface TssService {

    public Tss getTssAvgData();
    
    public Tss novoTss(Integer tssAvgMin, Double tssExpPlat, Integer tssAvgPlat, Double tssExpContent);
    
}
