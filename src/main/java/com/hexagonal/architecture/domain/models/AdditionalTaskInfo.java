package com.hexagonal.architecture.domain.models;

import lombok.Data;

@Data
public class AdditionalTaskInfo {
    private final Long userId;
    private final String userName;
    private final String userEmail;
}
