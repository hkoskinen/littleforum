package com.gravenium.littleforum.controller;

import com.gravenium.littleforum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public String users() {
        return userRepository.findAll().toString();
    }
}
