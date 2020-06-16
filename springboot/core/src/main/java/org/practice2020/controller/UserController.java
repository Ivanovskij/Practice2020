package org.practice2020.controller;

import org.practice2020.model.User;
import org.practice2020.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) {
        Optional<User> userOptional = userService.findUserById(userId);
        return userOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
