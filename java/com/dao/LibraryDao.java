package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Library;

public class LibraryDao {

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Library l = new Library();
		l.setBookId(21);
		l.setBookTitle("Wings of fire");
		l.setAuthorName("A P J Abdul Kalam");
		l.setPrice(400);
		l.setAvailable(true);
		l.setPublisher("Arun Tiwari");
		l.setLanguage("English");
		l.setIssueDate("12 march");
		l.setReturnDate("15 march");
		l.setStudentName("Minakshi deore");
		l.setStudentId(44);
		
		ss.persist(l);
		
		 tr.commit();
		 ss.close();
		
		System.out.println("Data is Inserted");
	}
	
	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int BookId = 21;
		Library l = ss.get(Library.class,BookId);
		l.setBookTitle("Atomic Habit");
		l.setPrice(300);
		l.setLanguage("Hindi");
		
		ss.update(l);
		
		System.out.println("Data is updated...!");
		
		tr.commit();
		ss.close();
		
	}
	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int BookId = 23;
		Library l = ss.get(Library.class,BookId);
		//ss.delete(l);
		ss.remove(l);
		System.out.println("Date is Deleted...!");
		
		tr.commit();
		ss.close();
		
		
	}
	public void getSingleRecord() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int BookId = 21;
		Library e1 = ss.get(Library.class, BookId);
		System.out.println(e1);
		

		tr.commit();
		ss.close();
	
	}
}
