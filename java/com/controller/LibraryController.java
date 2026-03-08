package com.controller;

import com.service.LibraryService;

public class LibraryController {
	
	public static void main(String[] args) {
		LibraryService service = new LibraryService();
		//service.insertData();
		
		//service.updateData();
		
		//service.deleteData();
		
		service.getSingleRecord();
	}

}
