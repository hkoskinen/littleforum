package com.gravenium.littleforum.controller;

import com.gravenium.littleforum.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return postRepository.findAll().toString();
    }
}
