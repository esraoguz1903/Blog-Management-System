package com.esra.oguz.BlogManagementSystem.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esra.oguz.BlogManagementSystem.entities.Users;

public interface UserRepository extends JpaRepository<Users	, Integer>{
	Optional<Users>  findById(int id);
}
