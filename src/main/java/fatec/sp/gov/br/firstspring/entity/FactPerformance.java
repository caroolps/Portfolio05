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
@Table(name = "fact_performance")
public class FactPerformance {

		@Id
		@Column(name = "prf_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	
	    @Column(name = "pfc_std_grade")
		private Float grade;
	    
		@ManyToOne
    	@JoinColumn(name = "prg_id", referencedColumnName = "prg_id")
		private Programme programme;
		
		@ManyToOne
    	@JoinColumn(name = "crs_id", referencedColumnName = "crs_id")
		private Course course;
		
		@ManyToOne
    	@JoinColumn(name = "std_id", referencedColumnName = "std_id")
		private Student student;
		
		@ManyToOne
    	@JoinColumn(name = "tim_id", referencedColumnName = "tim_id")
		private Time time;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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
