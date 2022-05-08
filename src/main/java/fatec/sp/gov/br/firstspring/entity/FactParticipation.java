package fatec.sp.gov.br.firstspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fact_participation")
public class FactParticipation {

	@Id
	@Column(name = "par_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "acc_elap")
	private Double elap;

	// @Column(name = "prf_qtd_dlr")
	// private Integer dlr;

	// @Column(name = "prf_qtd_asg")
	// private Integer asg;

	@Column(name = "term")
	private String term;

	@Column(name = "available")
	private Double available;

	@ManyToOne
	@JoinColumn(name = "dim_time_tim_id", referencedColumnName = "tim_id")
	private DimTime dimTime;
	
	@ManyToOne
	@JoinColumn(name = "dim_assigments_asg_id", referencedColumnName = "asg_id")
	private Assigments assigments;
	
	@ManyToOne
	@JoinColumn(name = "dim_student_std_id", referencedColumnName = "std_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "dim_class_of_idclass_of", referencedColumnName = "idclass_of")
	private ClassOf classOf;

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Double getAvailable() {
		return available;
	}

	public void setAvailable(Double available) {
		this.available = available;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getElap() {
		return elap;
	}

	public void setElap(Double elap) {
		this.elap = elap;
	}

	// public Integer getDlr() {
	// 	return dlr;
	// }

	// public void setDlr(Integer dlr) {
	// 	this.dlr = dlr;
	// }

	// public Integer getAsg() {
	// 	return asg;
	// }

	// public void setAsg(Integer asg) {
	// 	this.asg = asg;
	// }

	public DimTime getDimTime() {
		return dimTime;
	}

	public void setDimTime(DimTime dimTime) {
		this.dimTime = dimTime;
	}

	public Assigments getAssigments() {
		return assigments;
	}

	public void setAssigments(Assigments assigments) {
		this.assigments = assigments;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ClassOf getClassOf() {
		return classOf;
	}

	public void setClassOf(ClassOf classOf) {
		this.classOf = classOf;
	}




	
	
	
}
