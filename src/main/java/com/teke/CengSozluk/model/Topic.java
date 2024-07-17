package com.teke.CengSozluk.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@JsonPropertyOrder({
        "id",
        "title",
        "created_at",
        "created_by",
})

@Data
@Entity
@Table(name = "topic", schema = "public")

public class Topic {
    @Id
    private UUID id;

    private String title;

    private LocalDateTime created_at;

    private UUID created_by;
}
