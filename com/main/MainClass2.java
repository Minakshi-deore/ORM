package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.StudentData;

public class MainClass2 {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(StudentData.class);
		cfg.addAnnotatedClass(Courses.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		StudentData s = new StudentData();
		
		s.setStudName("Priya");
		s.setRollno(84);
		s.setCity("Pune");
		s.setEmail("priya@gmail.com");
		s.setMobileNo(234567876l);
		
		
		StudentData s1 = new StudentData();
		
		s1.setStudName("Minakshi");
		s1.setRollno(90);
		s1.setCity("Shirpur");
		s1.setEmail("minakshi@gmail.com");
		s1.setMobileNo(234567898l);
		
		Courses c = new Courses();
		c.setCourseName("java Fullstack");
		c.setCourseDuration("6 month");
		c.setCourseFees(25000);
		

		Courses c1 = new Courses();
		c1.setCourseName("Python Fullstack");
		c1.setCourseDuration("8 month");
		c1.setCourseFees(42000);
		
		List<StudentData> studlist = new ArrayList<StudentData>();
		studlist.add(s);
		studlist.add(s1);
		
		List<Courses>courselist = new ArrayList<Courses>();
		courselist.add(c);
		courselist.add(c1);
		
		s.setCourse(courselist);
		s1.setCourse(courselist);
		
		c.setStud(studlist);
		c.setStud(studlist);
		
		ss.persist(s);
		ss.persist(s1);
		ss.persist(c);
		ss.persist(c1);
		
		

		System.out.println("Data is inserted...!");

		tr.commit();
		ss.close();

	}

}
