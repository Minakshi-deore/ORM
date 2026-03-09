package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
	int studId;
    String name;
	String city;
	@OneToOne
	Laptop laptop;
	
	public Student() {
		
	}

	public Student(int studId, String name, String city, Laptop laptop) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
		this.laptop = laptop;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + ", laptop=" + laptop + "]";
	}
	
}
