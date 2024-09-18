package com.esra.oguz.BlogManagementSystem.webApi;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esra.oguz.BlogManagementSystem.business.abstracts.CommentService;
import com.esra.oguz.BlogManagementSystem.business.abstracts.UsersService;
import com.esra.oguz.BlogManagementSystem.business.requests.CreateCommentRequests;
import com.esra.oguz.BlogManagementSystem.business.responses.CommentResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdCommentResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdUsersResponse;
import com.esra.oguz.BlogManagementSystem.dataAccess.abstracts.CommentProjection;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/comments")
@AllArgsConstructor
public class CommentsController {
	private CommentService commentService;
	private UsersService usersService;
	private ModelMapper modelMapper;

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(CreateCommentRequests createCommentRequests) {

		int userId = createCommentRequests.getUserId();
		GetByIdUsersResponse getByIdUsersResponse = usersService.getById(userId);
		this.commentService.add(createCommentRequests);
	}
	 @GetMapping("/getAll")
	    public ResponseEntity<List<CommentResponse>> getAllComments() {
	        List<CommentResponse> commentResponses = commentService.getAll();
	        return ResponseEntity.ok(commentResponses);
	    }
	
	@GetMapping("/list/{id}")
	GetByIdCommentResponse getById(@PathVariable int id) {
		return commentService.getById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.commentService.delete(id);
	}
}


