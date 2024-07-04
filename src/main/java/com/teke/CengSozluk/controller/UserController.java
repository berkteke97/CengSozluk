package com.teke.CengSozluk.controller;

import com.teke.CengSozluk.dto.UserDTO;
import com.teke.CengSozluk.model.User;
import com.teke.CengSozluk.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class UserController {

    UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody UserDTO userDTO) throws Exception {
        return userService.addUser(userDTO);
    }
}
