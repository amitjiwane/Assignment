package com.example.demo.serviceImple;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostsRepository;
import com.example.demo.services.PostsService;

@Service
public class PostsServiceImple implements PostsService {
	
	@Autowired
	private PostsRepository postRepository;

	@Override
	public List<Post> getPosts() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Post savePosts(Post posts) {
		// TODO Auto-generated method stub
		return postRepository.save(posts);
	}

	@Override
	public Post updatePosts(Post posts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePosts(Post posts) {
		// TODO Auto-generated method stub
		return null;
	}

}
