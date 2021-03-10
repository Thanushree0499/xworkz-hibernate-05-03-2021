package com.xwork.mobile.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xwork.mobile.dto.MobileDTO;
import com.xworkz.singlefactory.SingleFactory;

public class MobilesDAOImpl implements MobilesDAO {

	@Override
	public void saveMobile(MobileDTO mobileDTO) {
		System.out.println("invoked saveMobile");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(mobileDTO);
			transaction.commit();
		} catch (HibernateException he) {
			transaction.rollback();
			he.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}

	}

	@Override
	public void readMobile(int mobileId) {
		System.out.println("invoked readMobile");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			MobileDTO mobileDTO = session.load(MobileDTO.class, mobileId);
			System.out.println(mobileDTO);
		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}

		}
	}

	@Override
	public void updateMobile(int mobileId) {
		System.out.println("invoked updateMobile");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			MobileDTO mobileDTO = session.get(MobileDTO.class, mobileId);
			mobileDTO.setBrand("oneplus");
			transaction = session.beginTransaction();
			session.update(mobileDTO);
			transaction.commit();
		} catch (HibernateException he) {
			transaction.rollback();
			he.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}

	}

	@Override
	public void deleteMobile(int mobileId) {
		System.out.println("invoked deleteMobile");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session = sessionFactory.openSession();
			MobileDTO mobileDTO = session.get(MobileDTO.class, mobileId);
			transaction = session.beginTransaction();
			session.delete(mobileDTO);
			transaction.commit();
		} catch (HibernateException he) {
			transaction.rollback();
			he.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				} else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}

	}
}
