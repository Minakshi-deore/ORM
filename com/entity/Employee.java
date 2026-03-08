package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	@Column(unique = true, nullable = false)
	private  String email;
	private String city;
	private long mobileNo;
	
	
	public Employee() {
		
	}


	public Employee(int empId, String empName, String email, String city, long mobileNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.city = city;
		this.mobileNo = mobileNo;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", city=" + city
				+ ", mobileNo=" + mobileNo + "]";
	}
	
	

}
