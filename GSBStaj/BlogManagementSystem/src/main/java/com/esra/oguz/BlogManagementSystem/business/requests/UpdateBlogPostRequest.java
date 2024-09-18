package com.esra.oguz.BlogManagementSystem.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBlogPostRequest {
	private int id;
	private String title;
	private String postContent;
	private int userId;
}
