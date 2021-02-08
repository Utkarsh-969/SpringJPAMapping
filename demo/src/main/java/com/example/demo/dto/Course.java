package com.example.demo.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "Course")
public class Course {
	
	@Id
	@GeneratedValue
	@Column(name = "course_id")
	private int courseId;
	
	@ManyToMany(mappedBy = "LikedCourses")
	Set<Student> Likes;

	public Course(int courseId, Set<Student> likes) {
		super();
		this.courseId = courseId;
		Likes = likes;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Set<Student> getLikes() {
		return Likes;
	}

	public void setLikes(Set<Student> likes) {
		Likes = likes;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

}
