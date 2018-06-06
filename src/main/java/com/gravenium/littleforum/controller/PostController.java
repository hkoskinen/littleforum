package com.gravenium.littleforum.controller;

import com.gravenium.littleforum.entity.Post;
import com.gravenium.littleforum.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public String posts(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "posts";
    }
}
