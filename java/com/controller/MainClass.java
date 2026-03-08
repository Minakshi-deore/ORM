package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpId(142);
		e.setEmpName("manav");
		e.setEmail("manav@gmail.com");
		e.setCity("nagpur");
		e.setMobileNo(908678765l);
		
		ss.persist(e);
		
		System.out.println("Data is Inserted...");		

		
		tr.commit();
		ss.close();
	}

}
