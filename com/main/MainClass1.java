package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.EmployeeData;


public class MainClass1 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeData.class);
		cfg.addAnnotatedClass(Department.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Department d = new Department();
		
		d.setDeptName("java Developer");
		d.setDeptEmail("Dev@gmail.com");
		
		EmployeeData e1 = new EmployeeData();
		e1.setEmpName("Minakshi");
		e1.setEmpId(134);
		e1.setCity("Pune");
		e1.setDept(d);
		EmployeeData e2 = new EmployeeData();
		e2.setEmpId(221);
		e2.setEmpName("Teju");
		e2.setCity("Dhule");
		e2.setDept(d);

		EmployeeData e3 = new EmployeeData();
		e3.setEmpId(232);
		e3.setEmpName("Nilima");
		e3.setCity("Mumbai");
		e3.setDept(d);

		List<EmployeeData> list = new ArrayList<EmployeeData>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);
		d.setEmp(list);

		System.out.println("Data is inserted...!");

		tr.commit();
		ss.close();

	}

}
