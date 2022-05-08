package fatec.sp.gov.br.firstspring.dto;
public class FactParticipationStudent {

    private Double acc_elap;
    private String term;
    private Long available;
    private Long dim_time_tim_id;
    private Long dim_assigments_asg_id;
    private Long dim_student_std_id;
    private Long dim_class_of_idclass_of;
    private Long par_id;
    private Long std_id;
    private String std_name;
    private Integer std_status;

    public Double getAcc_elap() {
        return acc_elap;
    }
    public void setAcc_elap(Double acc_elap) {
        this.acc_elap = acc_elap;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public Long getAvailable() {
        return available;
    }
    public void setAvailable(Long available) {
        this.available = available;
    }
    public Long getDim_time_tim_id() {
        return dim_time_tim_id;
    }
    public void setDim_time_tim_id(Long dim_time_tim_id) {
        this.dim_time_tim_id = dim_time_tim_id;
    }
    public Long getDim_assigments_asg_id() {
        return dim_assigments_asg_id;
    }
    public void setDim_assigments_asg_id(Long dim_assigments_asg_id) {
        this.dim_assigments_asg_id = dim_assigments_asg_id;
    }
    public Long getDim_student_std_id() {
        return dim_student_std_id;
    }
    public void setDim_student_std_id(Long dim_student_std_id) {
        this.dim_student_std_id = dim_student_std_id;
    }
    public Long getDim_class_of_idclass_of() {
        return dim_class_of_idclass_of;
    }
    public void setDim_class_of_idclass_of(Long dim_class_of_idclass_of) {
        this.dim_class_of_idclass_of = dim_class_of_idclass_of;
    }
    public Long getPar_id() {
        return par_id;
    }
    public void setPar_id(Long par_id) {
        this.par_id = par_id;
    }
    public Long getStd_id() {
        return std_id;
    }
    public void setStd_id(Long std_id) {
        this.std_id = std_id;
    }
    public String getStd_name() {
        return std_name;
    }
    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }
    public Integer getStd_status() {
        return std_status;
    }
    public void setStd_status(Integer std_status) {
        this.std_status = std_status;
    }

}
