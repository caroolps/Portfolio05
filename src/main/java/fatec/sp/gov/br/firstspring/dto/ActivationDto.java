package fatec.sp.gov.br.firstspring.dto;

import java.time.LocalDate;

public class ActivationDto {
    
    private Integer usr;
    private Integer sem;
    private LocalDate year;

    public Integer getUsr() {
        return usr;
    }
    public void setUsr(Integer usr) {
        this.usr = usr;
    }
    public Integer getSem() {
        return sem;
    }
    public void setSem(Integer sem) {
        this.sem = sem;
    }
    public LocalDate getYear() {
        return year;
    }
    public void setYear(LocalDate year) {
        this.year = year;
    }
    
}
