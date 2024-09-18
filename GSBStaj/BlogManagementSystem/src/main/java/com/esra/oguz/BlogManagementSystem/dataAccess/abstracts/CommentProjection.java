package com.esra.oguz.BlogManagementSystem.dataAccess.abstracts;

public interface CommentProjection {
	int getId();

	String getCommentContent();

	Integer getUserId();

	Integer getBlogpostId();
}
