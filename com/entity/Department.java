package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 int deptId;
	 String deptName;
	 String deptEmail;
	 
	 @OneToMany(mappedBy="dept")
	 List<EmployeeData> emp;
	 
	 public Department() {
		
	 }

	 public Department(int deptId, String deptName, String deptEmail,List<EmployeeData>emp) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptEmail = deptEmail;
		this.emp=emp;
	 }

	 public int getDeptId() {
		 return deptId;
	 }

	 public void setDeptId(int deptId) {
		 this.deptId = deptId;
	 }

	 public String getDeptName() {
		 return deptName;
	 }

	 public void setDeptName(String deptName) {
		 this.deptName = deptName;
	 }

	 public String getDeptEmail() {
		 return deptEmail;
	 }

	 public void setDeptEmail(String deptEmail) {
		 this.deptEmail = deptEmail;
	 }
	 
	 public List<EmployeeData>getEmp(){
		 return emp;
	 }
	 
	 public void setEmp(List<EmployeeData> list) {
		 this.emp=list;
	 }

	 @Override
	 public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptEmail=" + deptEmail + "emp=" +emp+"]";
	 }
	 
	 

}
