package com.esra.oguz.BlogManagementSystem.webApi;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esra.oguz.BlogManagementSystem.business.abstracts.UsersService;
import com.esra.oguz.BlogManagementSystem.business.requests.CreateUsersRegisterRequests;
import com.esra.oguz.BlogManagementSystem.business.responses.GetAllUsersRegisterResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor

public class UserController {
	private UsersService usersService;

	@GetMapping("/list")
	public List<GetAllUsersRegisterResponse> getAll() {
		return usersService.getAll();
	}

	@PostMapping("/register")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void register(CreateUsersRegisterRequests createUsersRegisterRequests) {
		this.usersService.register(createUsersRegisterRequests);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		usersService.delete(id);
	}
}
