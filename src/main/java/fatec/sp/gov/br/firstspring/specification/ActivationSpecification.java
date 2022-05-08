package fatec.sp.gov.br.firstspring.specification;

import java.time.LocalDate;

import org.springframework.data.jpa.domain.Specification;

import fatec.sp.gov.br.firstspring.entity.Activation;

public class ActivationSpecification {
    
    public static Specification<Activation> usr(Integer usr) {
        return (root, criteriaQuery, criteriaBuilder) ->
            criteriaBuilder.greaterThanOrEqualTo(root.get("actNumUsr"), usr);
    }

    public static Specification<Activation> sem(Integer sem) {

        if(sem == null){
            return (root, criteriaQuery, criteriaBuilder) ->
            criteriaBuilder.lessThanOrEqualTo(root.get("actSemestre"), 2);
        }

        return (root, criteriaQuery, criteriaBuilder) ->
            criteriaBuilder.equal(root.get("actSemestre"), sem);
        
    }

    public static Specification<Activation> year(LocalDate year) {
        return (root, criteriaQuery, criteriaBuilder) ->
            criteriaBuilder.greaterThanOrEqualTo(root.get("actSemYear"), year);
    }

}
