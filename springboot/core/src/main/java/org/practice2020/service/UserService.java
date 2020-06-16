package org.practice2020.service;

import org.practice2020.model.User;
import org.practice2020.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserById(Long userId) {
        return userRepository.findById(userId);
    }
}
