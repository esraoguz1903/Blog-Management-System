package com.esra.oguz.BlogManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esra.oguz.BlogManagementSystem.entities.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
	


		
}
