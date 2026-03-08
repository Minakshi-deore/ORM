package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;


import com.entity.Vehicle;

public class VehicleDao {
	
	public void insertData() {
		
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Vehicle.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
		
			Vehicle v = new Vehicle();
			v.setVehicleId(100);
			v.setVehicleType("2 wheeler");
			v.setVehicleName("bike");
			v.setVehiclebrand("Splender");
			v.setPrice(180000);
			v.setColor("Red");
			
			ss.persist(v);
			
			tr.commit();
			ss.close();
			System.out.println("Data is Inserted...!");
			
	}
	public void deleteRecord() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
	
		String hqlQuery ="delete from Vehicle where vehicleId =:vehicleId";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("vehicleId",200);
		query.executeUpdate();
		
		System.out.println("Data is deleted");
		tr.commit();
		ss.close();
}
}