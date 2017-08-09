package com.diablo.Application;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.diablo.Entity.Lecturer;


public class MyApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Lecturer st = new Lecturer();
		st.setFname("amit");
		st.setLname("KK");
		s.save(st);
		t.commit();
		s.close();
		System.out.println("inserted successfully");

	}

}
