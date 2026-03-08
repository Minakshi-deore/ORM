package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
  
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		//service.GetAllRecord();
		//service.GetSingleRecord();
		//service.DeleteRecord();
		service.UpdateRecord();
	}
}
