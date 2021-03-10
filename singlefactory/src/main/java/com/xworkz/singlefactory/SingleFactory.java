package com.xworkz.singlefactory;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleFactory {

	private static SessionFactory sessionFactory=null;
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeFactory() {
		if (Objects.nonNull(sessionFactory)) {
			sessionFactory.close();
			System.out.println("sessionfactory is closed");
		}else {
			System.out.println("sessionfactory is not closed");
		}	
	}	
}
