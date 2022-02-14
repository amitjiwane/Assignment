package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title, description;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tags_posts",
	           joinColumns = {   // intermediate physical table name
	        		   @JoinColumn(name = "posts_Id")  // column to connect with posts
	        		   }, 
	                inverseJoinColumns = {
	                    		 @JoinColumn(name = "tags_id") // column to connect with posts
	                     }
                   )
	private List<Tag> tags;


	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Post(Long id, String title, String description, List<Tag> tags) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tags = tags;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, id, tags, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(tags, other.tags) && Objects.equals(title, other.title);
	}


	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", description=" + description + ", tags=" + tags + "]";
	}
	
	
}
