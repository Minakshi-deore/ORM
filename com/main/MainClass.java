package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;





public class MainClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Laptop.class);
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =  ss.beginTransaction();
		
		Laptop l = new Laptop();
		l.setLaptopId(90);
		l.setBrand("HP");
		l.setPrice(80000);
		ss.persist(l);
		
		Student s = new Student();
		s.setStudId(21);
		s.setName("Minakshi");
		s.setCity("Pune");
		s.setLaptop(l);
		
		ss.persist(s);
		
		System.out.println("Data is Inserted");
		tr.commit();
		ss.close();
		
	}

}
