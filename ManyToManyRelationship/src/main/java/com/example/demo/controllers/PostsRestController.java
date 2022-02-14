package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.serviceImple.PostsServiceImple;

@RestController
@RequestMapping("/posts")
public class PostsRestController {

	@Autowired(required = true)
	private PostsServiceImple postsServiceImple;
	
	@GetMapping("/get")
	public List<Post> obtainPosts(){
		return postsServiceImple.getPosts();
	}
	
	@PostMapping("/save")
	public Post storePosts(@RequestBody Post posts) {
		return postsServiceImple.savePosts(posts);
		
	}
	
	@PutMapping("/update")
	public Post modifyPosts(@RequestBody Post posts) {
		return postsServiceImple.savePosts(posts);
		
	}
	
	@DeleteMapping("/delete")
	public String erasePosts(@RequestBody Post posts) {
		postsServiceImple.deletePosts(posts);
		return "Deleted"+posts;
	}
}
