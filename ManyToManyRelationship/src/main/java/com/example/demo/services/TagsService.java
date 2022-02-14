package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Tag;

public interface TagsService {

public List<Tag> getTags();
	
	public Tag saveTags(Tag tags);
	
	public Tag updateTags(Tag tags);
	
	public String deleteTags(Tag tags);
}
