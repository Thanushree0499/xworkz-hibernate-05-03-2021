package com.xworkz.register.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.singlefactory.SingleFactory;

public class RegisterDAOImpl implements RegisterDAO{
	
	private static SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

	@Override
	public void saveUserData(RegisterDTO registerDTO) {
		System.out.println("invoked saveUserData");
		Session session = null;
		Transaction transaction = null;
		try {
//			SessionFactory sessionFactory=SingleFactory.getSessionFactory();
			session=sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(registerDTO);
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}
		
		
	}
		
}


