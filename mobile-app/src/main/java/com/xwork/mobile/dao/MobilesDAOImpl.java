package com.xwork.mobile.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xwork.mobile.dto.MobileDTO;

public class MobilesDAOImpl implements MobilesDAO {

	@Override
	public void saveMobile(MobileDTO mobileDTO) {
		Session session = null;
		try {
			session = new Configuration().configure().buildSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			session.save(mobileDTO);
			transaction.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void readMobile(int mobileId) {
		Session session = null;
		try {
			session = new Configuration().configure().buildSessionFactory().openSession();
			// Session session=sessionFactory.openSession();
			MobileDTO mobileDTO = session.load(MobileDTO.class, mobileId);
			System.out.println(mobileDTO);
		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updateMobile(int mobileId) {
		Session session=null;
		try {
			session=new Configuration().configure().buildSessionFactory().openSession();
		    MobileDTO mobileDTO=session.get(MobileDTO.class,mobileId);
		    mobileDTO.setBrand("oneplus");
		    Transaction transaction=session.beginTransaction();
		    session.update(mobileDTO);
		    transaction.commit();
		}catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}

	@Override
	public void deleteMobile(int mobileId) {
		Session session=null;
		try {
			session=new Configuration().configure().buildSessionFactory().openSession();
		    MobileDTO mobileDTO = session.get(MobileDTO.class, mobileId);
		    Transaction transaction = session.beginTransaction();
		    session.delete(mobileDTO);
		    transaction.commit();
	   }catch (HibernateException he) {
		he.printStackTrace();
	   } finally {
		if (session != null) {
			session.close();
		}
	}

}
}
