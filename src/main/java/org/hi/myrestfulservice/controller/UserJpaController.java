package org.hi.myrestfulservice.controller;

import org.hi.myrestfulservice.bean.User;
import org.hi.myrestfulservice.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

    private UserRepository userRepository;

    public UserJpaController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // /jpa/users
    @GetMapping("users")
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }
}
