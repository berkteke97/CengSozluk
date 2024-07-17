package com.teke.CengSozluk.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class TopicDTO {
    private UUID id;
    private String title;
    //private LocalDateTime created_at;
    //private UUID created_by; bunu sistemden çekicez
}
