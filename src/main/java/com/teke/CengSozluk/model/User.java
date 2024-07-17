package com.teke.CengSozluk.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonPropertyOrder({
        "id",
        "username",
        "password",
        "name",
        "surname",
        "email",
        "phone",
        "address",
        "agreement",
        "activeOrder"
})

@Data
@Entity
@Table(name = "user", schema = "public")

public class User {

    @Id
    private UUID id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String city;
    private Boolean agreement;
    private String userRole;
    private LocalDateTime createdAt;
}
