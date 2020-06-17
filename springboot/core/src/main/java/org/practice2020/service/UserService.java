package org.practice2020.service;

import org.practice2020.model.User;
import org.practice2020.repository.UserRepository;
import org.practice2020.specification.SpecificationBuilder;
import org.practice2020.specification.UserSpecificationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserSpecificationFactory userSpecificationFactory;

    public Optional<User> findUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public Page findUsers(String search, int page) {
        SpecificationBuilder<User> userBuilder = new SpecificationBuilder<>(userSpecificationFactory.findUsers());
        if (!StringUtils.isEmpty(search)) {
            userBuilder.appendAnd(userSpecificationFactory.findUsers(search));
        }
        return userRepository.findAll(userBuilder.build(), PageRequest.of(page - 1, 5));
    }
}
