package com.esra.oguz.BlogManagementSystem.business.abstracts;

import java.util.List;

import com.esra.oguz.BlogManagementSystem.business.requests.CreateBlogPostRequest;
import com.esra.oguz.BlogManagementSystem.business.requests.UpdateBlogPostRequest;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdBlogPostResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.BlogPostResponse;

public interface BlogService {
	List<BlogPostResponse> getAll();

	GetByIdBlogPostResponse getById(int id);

	void add(CreateBlogPostRequest createBlogPostRequest);

	void update(UpdateBlogPostRequest updateBlogPostRequest);

	void delete(int id);
}
