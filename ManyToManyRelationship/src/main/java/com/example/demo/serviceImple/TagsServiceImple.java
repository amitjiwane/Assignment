package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tag;
import com.example.demo.repository.TagsRepository;
import com.example.demo.services.TagsService;

@Service
public class TagsServiceImple implements TagsService {

	@Autowired
	private TagsRepository tagsRepository;

	@Override
	public List<Tag> getTags() {
		// TODO Auto-generated method stub
		return tagsRepository.findAll();
	}

	@Override
	public Tag saveTags(Tag tags) {
		// TODO Auto-generated method stub
		return tagsRepository.save(tags);
	}

	@Override
	public Tag updateTags(Tag tags) {
		// TODO Auto-generated method stub
		return tagsRepository.save(tags);
	}

	@Override
	public String deleteTags(Tag tags) {
		// TODO Auto-generated method stub
		tagsRepository.delete(tags);
		return "Deleted"+tags;
	}
}
