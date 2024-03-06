package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Account acc = new Account();
		acc.setId(8);
		acc.setName("SaM");

		Employee emp = new Employee();
		emp.setName("Ram");
		emp.setAddress("Kolhapur");
		emp.setAccount(acc);

		session.save(emp);
		session.save(acc);
		tx.commit();
		session.close();
		factory.close();

	}

}
