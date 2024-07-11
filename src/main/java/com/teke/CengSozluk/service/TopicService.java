package com.teke.CengSozluk.service;

import com.teke.CengSozluk.dto.TopicDTO;
import com.teke.CengSozluk.dto.UserDTO;
import com.teke.CengSozluk.model.User;
import com.teke.CengSozluk.model.Topic;
import com.teke.CengSozluk.repository.TopicRepository;
import com.teke.CengSozluk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Service
public class TopicService {

    @Autowired
    UserRepository userRepository; //??
    TopicRepository topicRepository;

    public Topic addTopic(TopicDTO topicDTO) {
        Topic existTopic = topicRepository.findByid(topicDTO.getId());
        if (Objects.nonNull(existTopic)){
            throw new RuntimeException("Topic already exists");
        }
        Topic newTopic = new Topic();
        newTopic.setId(UUID.randomUUID());
        newTopic.setTitle(topicDTO.getTitle());
        newTopic.setCreated_at(LocalDateTime.now());
        newTopic.setCreated_by(UUID.randomUUID()); // This line will be changed with the related user's ID when log in operation is completed.

        return topicRepository.save(newTopic);
    }
}
