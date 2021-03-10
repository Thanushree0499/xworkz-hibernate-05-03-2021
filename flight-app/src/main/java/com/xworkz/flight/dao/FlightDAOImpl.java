package com.xworkz.flight.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.singlefactory.SingleFactory;

public class FlightDAOImpl implements FlightDAO {

	@Override
	public void saveFlight(FlightDTO flightDTO) {
		System.out.println("invoked saveFlight");
		Session session = null;
		Transaction transaction=null;
		try{
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session=sessionFactory.openSession();
		    transaction=session.beginTransaction();
		    session.save(flightDTO);
		    transaction.commit();
		}catch (HibernateException he) {
			transaction.rollback();
			he.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				}else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}		
	}

	@Override
	public void readFlight(int flightId) {
		System.out.println("invoked readFlight");
		Session session = null;
		try{
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
		    session=sessionFactory.openSession();
		    FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		    System.out.println(flightDTO);
		}catch (HibernateException he) {
			he.printStackTrace();
		}  finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				}else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}	
	}

	@Override
	public void updateFlight(int flightId) {
		System.out.println("invoked updateFlight");
		Session session = null;
		Transaction transaction=null;
		try{
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session=sessionFactory.openSession();
		    FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		    flightDTO.setSource("Bangalore");
		    transaction=session.beginTransaction();
		    session.update(flightDTO);
		    transaction.commit();
		}catch (HibernateException he) {
			transaction.rollback();
			he.printStackTrace();
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session is closed");
				}else {
					System.out.println("session is not closed");
				}
				SingleFactory.closeFactory();
			} catch (HibernateException he2) {
				he2.printStackTrace();
			}
		}
	}

	@Override
	public void deleteFlight(int flightId) {
		System.out.println("invoked deleteFlight");
		Session session = null;
		Transaction transaction=null;
		try{
			SessionFactory sessionFactory = SingleFactory.getSessionFactory();
			session=sessionFactory.openSession();
		    FlightDTO flightDTO=session.get(FlightDTO.class, flightId);
		    transaction=session.beginTransaction();
		    session.delete(flightDTO);
		    transaction.commit();
		}catch (HibernateException he) {
			transaction.rollback();
			he.printStackTrace();
		} finally {
			   try {
					if (Objects.nonNull(session)) {
						session.close();
						System.out.println("session is closed");
					}else {
						System.out.println("session is not closed");
					}
					SingleFactory.closeFactory();
				} catch (HibernateException he2) {
					he2.printStackTrace();
				}
		}
		
		
	}

}
