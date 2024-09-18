package com.esra.oguz.BlogManagementSystem.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdUsersResponse {
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
}
