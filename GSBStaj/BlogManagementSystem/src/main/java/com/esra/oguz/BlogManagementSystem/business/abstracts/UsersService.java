package com.esra.oguz.BlogManagementSystem.business.abstracts;

import java.util.List;

import com.esra.oguz.BlogManagementSystem.business.requests.CreateUsersRegisterRequests;
import com.esra.oguz.BlogManagementSystem.business.responses.GetAllUsersRegisterResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdUsersResponse;

public interface UsersService {
	List<GetAllUsersRegisterResponse> getAll();

	void register(CreateUsersRegisterRequests createUsersRegisterRequests);

	void delete(int id);

	GetByIdUsersResponse getById(int id);

}
