package com.esra.oguz.BlogManagementSystem.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersRegisterResponse {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
}
