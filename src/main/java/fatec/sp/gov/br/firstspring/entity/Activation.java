package fatec.sp.gov.br.firstspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "activation")
public class Activation {
    @Id
	@Column(name = "act_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "act_num_usr")
	private Integer actNumUsr;

	@Column(name = "act_semestre")
	private Integer actSemestre;

	@Column(name = "act_sem_year")
	private LocalDate actSemYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getActNumUsr() {
        return actNumUsr;
    }

    public void setActNumUsr(Integer actNumUsr) {
        this.actNumUsr = actNumUsr;
    }

    public Integer getActSemestre() {
        return actSemestre;
    }

    public void setActSemestre(Integer actSemestre) {
        this.actSemestre = actSemestre;
    }

    public LocalDate getActSemYear() {
        return actSemYear;
    }

    public void setActSemYear(LocalDate actSemYear) {
        this.actSemYear = actSemYear;
    }
}
