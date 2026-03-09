package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeData {
	@Id
	int empId;

	String empName;
	String city;

	@ManyToOne
	@JoinColumn(name = "dedd")
	Department dept;

	public EmployeeData() {

	}

	public EmployeeData(int empId, String empName, String city, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.dept = dept;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + ", city=" + city + ", dept=" + dept + "]";
	}
	
}
