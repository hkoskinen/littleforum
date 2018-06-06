package com.gravenium.littleforum.controller;

import com.gravenium.littleforum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping("/topics")
    @ResponseBody
    public String topics() {
        return topicRepository.findAll().toString();
    }
}
