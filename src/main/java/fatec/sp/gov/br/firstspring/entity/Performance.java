package fatec.sp.gov.br.firstspring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "performance")
public class Performance {

    @Id
	@Column(name = "prf_std_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "prf_course")
	private String course;

	@Column(name = "prf_partial_grade")
	private Double grade;

	@Column(name = "prf_partial_classes")
	private Integer parClasses;

	@Column(name = "prf_total_classes")
	private Integer totClasses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getParClasses() {
        return parClasses;
    }

    public void setParClasses(Integer parClasses) {
        this.parClasses = parClasses;
    }

    public Integer getTotClasses() {
        return totClasses;
    }

    public void setTotClasses(Integer totClasses) {
        this.totClasses = totClasses;
    }
}
