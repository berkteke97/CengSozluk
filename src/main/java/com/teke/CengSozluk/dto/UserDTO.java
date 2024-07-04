package com.teke.CengSozluk.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;
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
    private Timestamp created_at;
}
