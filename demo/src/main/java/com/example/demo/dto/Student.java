package com.example.demo.dto;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity(name="Student")
public class Student {
	
	@Id
	@GeneratedValue
	private int student_id;

	@ManyToMany
	@JoinTable(name = "course_like"
	,joinColumns = @JoinColumn(name="student_id") 
	,inverseJoinColumns = @JoinColumn(name="course_id") 
	)
	Set<Course> LikedCourses;
	
	
	public int getStudent_id() {
		return student_id;
	}


	public Student(int student_id, Set<Course> likedCourses) {
		super();
		this.student_id = student_id;
		LikedCourses = likedCourses;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public Set<Course> getLikedCourses() {
		return LikedCourses;
	}


	public void setLikedCourses(Set<Course> likedCourses) {
		LikedCourses = likedCourses;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}

}
