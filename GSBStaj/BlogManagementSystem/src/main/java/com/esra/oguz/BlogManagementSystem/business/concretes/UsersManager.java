package com.esra.oguz.BlogManagementSystem.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.esra.oguz.BlogManagementSystem.business.abstracts.UsersService;
import com.esra.oguz.BlogManagementSystem.business.requests.CreateUsersRegisterRequests;
import com.esra.oguz.BlogManagementSystem.business.responses.GetAllUsersRegisterResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdUsersResponse;
import com.esra.oguz.BlogManagementSystem.core.utilities.mappers.ModelMapperService;
import com.esra.oguz.BlogManagementSystem.dataAccess.abstracts.UserRepository;
import com.esra.oguz.BlogManagementSystem.entities.Users;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class UsersManager implements UsersService {
	private UserRepository userRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllUsersRegisterResponse> getAll() {
		List<Users> users = userRepository.findAll();

		List<GetAllUsersRegisterResponse> userResponse = users.stream()
				.map(user -> this.modelMapperService.forResponse().map(user, GetAllUsersRegisterResponse.class))
				.collect(Collectors.toList());
		return userResponse;
	}

	@Override
	public void register(CreateUsersRegisterRequests createUsersRegisterRequests) {
		Users user = this.modelMapperService.forRequest().map(createUsersRegisterRequests, Users.class);
		this.userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		userRepository.deleteById(id);

	}

	@Override
	public GetByIdUsersResponse getById(int id) {
		Users users = this.userRepository.findById(id).orElseThrow();
		GetByIdUsersResponse getByIdUsersResponse = this.modelMapperService.forResponse().map(users,
				GetByIdUsersResponse.class);
		return getByIdUsersResponse;
	}
}
