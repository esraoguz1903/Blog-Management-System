package com.esra.oguz.BlogManagementSystem.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPostResponse {
	private int id;
	private String title;
	private String postContent;
	private int userId;
	
}
