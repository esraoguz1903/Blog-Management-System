package com.esra.oguz.BlogManagementSystem.business.abstracts;

import java.util.List;

import com.esra.oguz.BlogManagementSystem.business.requests.CreateCommentRequests;
import com.esra.oguz.BlogManagementSystem.business.responses.CommentResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdCommentResponse;

public interface CommentService {
	public void add(CreateCommentRequests createCommentRequests);

	public List<CommentResponse> getAll();

	GetByIdCommentResponse getById(int id);

	void delete(int id);

}
