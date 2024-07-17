package com.teke.CengSozluk.service;

import com.teke.CengSozluk.dto.UserDTO;
import com.teke.CengSozluk.model.User;
import com.teke.CengSozluk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(UserDTO userDTO) throws Exception{
        User existUser = userRepository.findByUsername(userDTO.getUsername());
        if (Objects.nonNull(existUser)){
            throw new RuntimeException("User already exist");
        }
        User newUser = new User();
        newUser.setId(UUID.randomUUID());
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(userDTO.getPassword());
        newUser.setName(userDTO.getName());
        newUser.setSurname(userDTO.getSurname());
        newUser.setEmail(userDTO.getEmail());
        newUser.setCity(userDTO.getCity());
        newUser.setAgreement(userDTO.getAgreement());
        newUser.setUserRole(userDTO.getUserRole());
        newUser.setCreatedAt(LocalDateTime.now());

        User newuser1 = userRepository.save(newUser);
        return newUser;
    }
}
