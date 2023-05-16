package com.prologapp.batepapodev.domain.repository.specs;

import com.prologapp.batepapodev.domain.model.User;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class UserSpecs {

    public static Specification<User> filterByDate(OffsetDateTime startDate, OffsetDateTime endDate){
        return(root, query, builder) -> {
            final var predicates = new ArrayList<>();

            if (startDate != null & endDate != null){
                predicates.add(builder.between(root.get("dataCadastro"), startDate, endDate));
            }

            return builder.and(predicates.toArray(new Predicate[0]));
        };
    }

    public static Specification<User> filterByCpf(String cpf){
        return(root, query, builder) -> builder.equal(root.get("cpf"), cpf);
    }

    public static Specification<User> filterByStatus(boolean status) {
        return (root, query, builder) -> builder.equal(root.get("status"), status);
    }
}
