package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employee;

public class EmployeeDao {

	
	public void getAllRecord() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Employee";
		Query<Employee> query = ss.createQuery(hqlQuery,Employee.class);
		List<Employee> list = query.getResultList();
		
		for(Employee employee: list) {
			System.out.println(employee);
		}
		tr.commit();
		ss.close();
}
	
	public void getSingleRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Employee where empId =:empId";
		Query query1 = ss.createQuery(hqlQuery,Employee.class);
		query1.setParameter("empId", 121);
		Employee e1 = (Employee) query1.getSingleResult();
		System.out.println(e1);
		
		tr.commit();
		ss.close();
		
	}
	public void deleteRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
	
		String hqlQuery ="delete from Employee where empId =:empId";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("empId",130);
		query.executeUpdate();
		
		System.out.println("Data is deleted");
		tr.commit();
		ss.close();
}
	public void updateRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
	
		String hqlQuery ="update Employee set city =:city where empId =:empId";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("city","Delhi");
		query.setParameter("empId",121);
		query.executeUpdate();
		
		System.out.println("Data is updated..");
		tr.commit();
		ss.close();
}
	
}