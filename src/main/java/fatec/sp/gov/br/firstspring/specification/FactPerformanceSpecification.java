package fatec.sp.gov.br.firstspring.specification;

import org.springframework.data.jpa.domain.Specification;

import fatec.sp.gov.br.firstspring.entity.Course;
import fatec.sp.gov.br.firstspring.entity.FactPerformance;
import fatec.sp.gov.br.firstspring.entity.Programme;
import fatec.sp.gov.br.firstspring.entity.Student;
import fatec.sp.gov.br.firstspring.entity.Time;

public class FactPerformanceSpecification {

	public static Specification<FactPerformance> grade(Float grade) {

		if(grade == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
			.greaterThanOrEqualTo(root.get("grade"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("grade"), grade);
	}

	public static Specification<FactPerformance> idProgramme(Programme programme) {

		if (programme == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
				.greaterThanOrEqualTo(root.get("programme").get("id"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("programme").get("id"),
				programme.getId());
	}

	public static Specification<FactPerformance> idCourse (Course course) {

		if (course == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("course").get("id"), 0);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("course").get("id"),
				course.getId());
	}
	
	public static Specification<FactPerformance> idStudent (Student student) {

		if (student == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("student").get("id"), 0);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("student").get("id"),
				student.getId());
	}
	

	public static Specification<FactPerformance> idTime (Time time) {

		if (time == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("time").get("id"), 0);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("time").get("id"),
				time.getId());
	}

	public static Specification<FactPerformance> Year (Time time) {

		if (time == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
				.greaterThanOrEqualTo(root.get("time").get("year"), 1900);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("time").get("year"),
				time.getYear());
	}

	public static Specification<FactPerformance> Semester (Time time) {

		if (time != null){
			if (time.getSemestre() == null) {
				return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("time").get("semestre"), 1);
			}
		}else{
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
				.greaterThanOrEqualTo(root.get("time").get("semestre"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("time").get("semestre"),
				time.getSemestre());
	}
}
