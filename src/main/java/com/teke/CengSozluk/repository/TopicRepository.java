package com.teke.CengSozluk.repository;

import com.teke.CengSozluk.model.Topic;
import com.teke.CengSozluk.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;


public interface TopicRepository extends CrudRepository<Topic, UUID> {

    Topic findByid(UUID id);
}
