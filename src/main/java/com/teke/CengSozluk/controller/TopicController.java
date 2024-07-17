package com.teke.CengSozluk.controller;

import com.teke.CengSozluk.dto.TopicDTO;
import com.teke.CengSozluk.model.Topic;
import com.teke.CengSozluk.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping("/addTopic")
    public Topic addTopic(@RequestBody TopicDTO topicDTO) throws Exception {
        return topicService.addTopic(topicDTO);
    }
}
