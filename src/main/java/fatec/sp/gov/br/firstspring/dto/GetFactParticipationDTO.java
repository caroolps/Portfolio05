package fatec.sp.gov.br.firstspring.dto;

import fatec.sp.gov.br.firstspring.entity.Assigments;
import fatec.sp.gov.br.firstspring.entity.ClassOf;
import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.entity.Time;

public class GetFactParticipationDTO {

	private Integer elap;
	
	private Integer dlr;
	
	private Integer asg;
	
	private Time time;
	
	private Assigments assigments;
	
	private Student student;
	
	private ClassOf classOf;

	public Integer getElap() {
		return elap;
	}

	public void setElap(Integer elap) {
		this.elap = elap;
	}

	public Integer getDlr() {
		return dlr;
	}

	public void setDlr(Integer dlr) {
		this.dlr = dlr;
	}

	public Integer getAsg() {
		return asg;
	}

	public void setAsg(Integer asg) {
		this.asg = asg;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
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
