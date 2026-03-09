package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class StudentData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int studId;
	String studName;
	String email;
	int rollno;
	long mobileNo;
	String city;
	
	@ManyToMany
	List<Courses>course;

	public StudentData() {
	
	}

	public StudentData(int studId, String studName, String email, int rollno, long mobileNo, String city,
			List<Courses> course) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.email = email;
		this.rollno = rollno;
		this.mobileNo = mobileNo;
		this.city = city;
		this.course = course;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudenData [studId=" + studId + ", studName=" + studName + ", email=" + email + ", rollno=" + rollno
				+ ", mobileNo=" + mobileNo + ", city=" + city + ", course=" + course + "]";
	}
	
	
	

}
