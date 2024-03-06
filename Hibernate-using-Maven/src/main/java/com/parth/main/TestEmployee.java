package com.parth.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.parth.Hibernate.Employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setName("Parth");
		emp.setAddress("Satara");
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		tx.commit();
		session.close();
		
		System.out.println("Done");
	}

}
