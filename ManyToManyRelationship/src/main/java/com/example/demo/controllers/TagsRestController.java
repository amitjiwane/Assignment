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

import com.example.demo.model.Tag;
import com.example.demo.serviceImple.TagsServiceImple;

@RestController
@RequestMapping("/tags")
public class TagsRestController {

	@Autowired(required = true)
	private TagsServiceImple tagsServiceImple;
	
	@GetMapping("/get")
	public List<Tag> obtainTags(){
		return tagsServiceImple.getTags();
	}
	
	@PostMapping("/save")
	public Tag storeTags(@RequestBody Tag tags) {
		return tagsServiceImple.saveTags(tags);
		
	}
	
	@PutMapping("/update")
	public Tag modifyTags(@RequestBody Tag tags) {
		return tagsServiceImple.updateTags(tags);
		
	}
	
	@DeleteMapping("/delete")
	public String eraseTags(@RequestBody Tag tags) {
		tagsServiceImple.deleteTags(tags);
		return "Deleted"+tags;
	}
}
