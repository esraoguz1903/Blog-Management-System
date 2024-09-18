package com.esra.oguz.BlogManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esra.oguz.BlogManagementSystem.entities.BlogPosts;

public interface BlogRepository extends JpaRepository<BlogPosts, Integer>{
	BlogPosts findBlogPostsByUserId(int id);
}
