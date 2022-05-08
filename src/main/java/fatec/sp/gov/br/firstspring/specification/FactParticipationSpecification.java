package fatec.sp.gov.br.firstspring.specification;

import org.springframework.data.jpa.domain.Specification;

import fatec.sp.gov.br.firstspring.entity.Assigments;
import fatec.sp.gov.br.firstspring.entity.ClassOf;
import fatec.sp.gov.br.firstspring.entity.DimTime;
import fatec.sp.gov.br.firstspring.entity.FactParticipation;
import fatec.sp.gov.br.firstspring.entity.Student;

public class FactParticipationSpecification {

	public static Specification<FactParticipation> elap(Integer elap) {

		if(elap == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
			.greaterThanOrEqualTo(root.get("elap"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("elap"), elap);
		
	}
		
	public static Specification<FactParticipation> dlr(Integer dlr) {

		if(dlr == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
			.greaterThanOrEqualTo(root.get("dlr"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("dlr"), dlr);
		
	}
	
	public static Specification<FactParticipation> asg(Integer asg) {

		if(asg == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
			.greaterThanOrEqualTo(root.get("asg"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("asg"), asg);
		
		
	}

	public static Specification<FactParticipation> idAssigments(Assigments assigments) {

		if (assigments == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
				.greaterThanOrEqualTo(root.get("assigments").get("id"), 1);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("assigments").get("id"),
				assigments.getId());
	}

	public static Specification<FactParticipation> idClassOf (ClassOf classOf) {

		if (classOf == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("classOf").get("id"), 0);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("classOf").get("id"),
				classOf.getId());
	}
	
	public static Specification<FactParticipation> idStudent (Student student) {

		if (student == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("student").get("id"), 0);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("student").get("id"),
				student.getId());
	}
	

	public static Specification<FactParticipation> idTime (DimTime dimTime) {

		if (dimTime == null) {
			return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
					.greaterThanOrEqualTo(root.get("dimTime").get("id"), 0);
		}

		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("dimTime").get("id"),
				dimTime.getId());
	}

	

	
}
