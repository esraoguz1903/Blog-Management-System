package com.esra.oguz.BlogManagementSystem.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdCommentResponse {
	private int id;
	private String commentContent;
	private int blogpostId;
	private int userId;
}
