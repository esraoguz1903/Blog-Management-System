package com.esra.oguz.BlogManagementSystem.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommentRequests {
	private String commentContent;
	private int blogpostId;
	private int userId;
}
