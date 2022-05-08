package fatec.sp.gov.br.firstspring.dto;

import fatec.sp.gov.br.firstspring.entity.Course;
import fatec.sp.gov.br.firstspring.entity.Programme;
import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.entity.Time;

public class GetFactPerformanceDTO {

	private Float grade;

	private Programme programme;

	private Course course;

	private Student student;

	private Time time;

	public Float getGrade() {
		return grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}

	public Programme getProgramme() {
		return programme;
	}

	public void setProgramme(Programme programme) {
		this.programme = programme;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
