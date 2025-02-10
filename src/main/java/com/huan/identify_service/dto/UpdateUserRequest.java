package com.huan.identify_service.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
@Builder
public class UpdateUserRequest {
    UUID userId;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
