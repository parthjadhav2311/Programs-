package com.parth.School;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.parth.Hibernate.School;

public class TestSchool {
	

		public static void main(String[] args) {

			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

			School s = new School();
			s.setId(10);
			s.setName("parth");

			Session session = factory.openSession();

			Transaction tx = session.beginTransaction();

			session.save(s);
			session.delete(s);

			tx.commit();

			session.close();
		}

}
