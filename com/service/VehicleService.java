package com.service;

import com.dao.VehicleDao;

public class VehicleService {
	
	public void InsertData() {
		VehicleDao dao = new VehicleDao();
		dao.insertData();
	}
	public void DeleteData() {
		VehicleDao dao = new VehicleDao();
		dao.deleteRecord();
	}

}
