package com.esra.oguz.BlogManagementSystem.webApi;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esra.oguz.BlogManagementSystem.business.abstracts.BlogService;
import com.esra.oguz.BlogManagementSystem.business.requests.CreateBlogPostRequest;
import com.esra.oguz.BlogManagementSystem.business.requests.UpdateBlogPostRequest;
import com.esra.oguz.BlogManagementSystem.business.responses.BlogPostResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdBlogPostResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/blogPosts")
@AllArgsConstructor
public class BlogPostController {
	private BlogService blogService;
	
	@GetMapping("/list")
	public List<BlogPostResponse> getAll(){
		return blogService.getAll();
	}
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(CreateBlogPostRequest createBlogPostRequest) {
		this.blogService.add(createBlogPostRequest);
	}
	@PutMapping("/update")
	public void update(UpdateBlogPostRequest updateBlogPostRequest) {
		this.blogService.update(updateBlogPostRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.blogService.delete(id);
	}
	
	@GetMapping("/list/{id}")
	public GetByIdBlogPostResponse getById(@PathVariable int id) {
		return blogService.getById(id);
	}
	
}
