package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Parth.Student;

public class TestStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Student s = new Student();
		s.setId(101);
		s.setName("parth");

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s);
		session.delete(s);

		tx.commit();

		session.close();
	}

}
