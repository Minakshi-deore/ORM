package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {
	String courseName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;
	String courseDuration;
	int courseFees;
	
	@ManyToMany(mappedBy="course")
	List<StudentData>stud;

	public Courses() {
		
	}

	public Courses(String courseName, int courseId, String courseDuration, int courseFees, List<StudentData> stud) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
		this.stud = stud;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public List<StudentData> getStud() {
		return stud;
	}

	public void setStud(List<StudentData> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", courseId=" + courseId + ", courseDuration=" + courseDuration
				+ ", courseFees=" + courseFees + ", stud=" + stud + "]";
	}
	

}
