package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Post;

public interface PostsService {

	public List<Post> getPosts();
	
	public Post savePosts(Post posts);
	
	public Post updatePosts(Post posts);
	
	public String deletePosts(Post posts);
}
