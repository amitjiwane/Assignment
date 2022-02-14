package com.example.demo.model;


import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tags")
	private List<Post> posts;


	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tag(Long id, String name, List<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.posts = posts;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Post> getPosts() {
		return posts;
	}


	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, posts);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(posts, other.posts);
	}


	@Override
	public String toString() {
		return "Tags [id=" + id + ", name=" + name + ", posts=" + posts + "]";
	}
	
	
}
