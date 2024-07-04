package com.teke.CengSozluk.repository;

import com.teke.CengSozluk.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

    User findByUsername(String username);

}
