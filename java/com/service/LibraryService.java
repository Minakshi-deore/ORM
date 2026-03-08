package com.service;

import com.dao.LibraryDao;

public class LibraryService {
  
	public void insertData() {
		LibraryDao dao = new LibraryDao();
		dao.insertData();
		
	}
	public void updateData() {
		LibraryDao dao = new LibraryDao();
		dao.updateData();
	}
	
	public void deleteData() {
		LibraryDao dao = new LibraryDao();
		dao.deleteData();
	}
	
	public void getSingleRecord() {
		LibraryDao dao = new LibraryDao();
		dao.getSingleRecord();
	}

}
