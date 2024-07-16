package com.teke.CengSozluk.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String city;
    private Boolean agreement;
    private String userRole;
}