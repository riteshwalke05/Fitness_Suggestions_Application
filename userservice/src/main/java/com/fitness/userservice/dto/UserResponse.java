package com.fitness.userservice.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserResponse {
	private Integer id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	

}
