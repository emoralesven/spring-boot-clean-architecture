package com.hexagonal.architecture.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class Task {
    private Long id;
    private String tittle;
    private String description;
    private LocalDateTime creationDate;
    private boolean completed;
}
