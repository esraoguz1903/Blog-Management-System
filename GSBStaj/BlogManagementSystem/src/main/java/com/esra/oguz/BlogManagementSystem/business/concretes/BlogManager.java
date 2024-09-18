package com.esra.oguz.BlogManagementSystem.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.esra.oguz.BlogManagementSystem.business.abstracts.BlogService;
import com.esra.oguz.BlogManagementSystem.business.requests.CreateBlogPostRequest;
import com.esra.oguz.BlogManagementSystem.business.requests.UpdateBlogPostRequest;
import com.esra.oguz.BlogManagementSystem.business.responses.BlogPostResponse;
import com.esra.oguz.BlogManagementSystem.business.responses.GetByIdBlogPostResponse;
import com.esra.oguz.BlogManagementSystem.core.utilities.mappers.ModelMapperService;
import com.esra.oguz.BlogManagementSystem.dataAccess.abstracts.BlogRepository;
import com.esra.oguz.BlogManagementSystem.entities.BlogPosts;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BlogManager implements BlogService {
	private BlogRepository blogRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<BlogPostResponse> getAll() {
		List<BlogPosts> blogPosts = blogRepository.findAll();

		List<BlogPostResponse> blogPostResponses = blogPosts.stream().

				map(blogpost -> this.modelMapperService.forResponse().map(blogpost, BlogPostResponse.class))
				.collect(Collectors.toList());

		return blogPostResponses;

	}

	@Override
	public GetByIdBlogPostResponse getById(int id) {
		BlogPosts blogPosts = this.blogRepository.findById(id).orElseThrow();
		GetByIdBlogPostResponse getByIdBlogPostResponse = this.modelMapperService.forResponse().map(blogPosts,
				GetByIdBlogPostResponse.class);
		return getByIdBlogPostResponse;
	}

	@Override
	public void add(CreateBlogPostRequest createBlogPostRequest) {
		BlogPosts blogPosts = this.modelMapperService.forRequest().map(createBlogPostRequest, BlogPosts.class);
		this.blogRepository.save(blogPosts);


	}

	@Override
	public void update(UpdateBlogPostRequest updateBlogPostRequest) {
		BlogPosts blogPosts = this.modelMapperService.forRequest().map(updateBlogPostRequest, BlogPosts.class);
		this.blogRepository.save(blogPosts);
	}

	@Override
	public void delete(int id) {
		this.blogRepository.deleteById(id);

	}
}
