package org.practice2020.specification;

import org.practice2020.model.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Predicate;

@Component
public class UserSpecificationFactory {

    private static final String USER_NAME_COLUMN = "name";
    private static final String USER_LOGIN_COLUMN = "login";
    private static final String PROFILE_ENTITY_NAME = "profile";

    public Specification<User> findUsers() {
        return ((root, criteriaQuery, criteriaBuilder) -> {
            criteriaQuery.distinct(true);
            return criteriaBuilder.and();
        });
    }

    public Specification<User> findUsers(String search) {
        return ((root, criteriaQuery, criteriaBuilder) -> {
            Predicate nameSearch = criteriaBuilder.like(root.join(PROFILE_ENTITY_NAME).get(USER_NAME_COLUMN), "%" + search + "%");
            Predicate loginSearch = criteriaBuilder.like(root.get(USER_LOGIN_COLUMN), "%" + search + "%");
            return criteriaBuilder.or(nameSearch, loginSearch);
        });
    }

}
