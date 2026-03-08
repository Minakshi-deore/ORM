package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	public void GetAllRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.getAllRecord();

	}
	public void GetSingleRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.getSingleRecord();
	}
	public void DeleteRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteRecord();
	}
	public void UpdateRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.updateRecord();
	}

}
