package com.xworkz.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.dto.TractorDTO;

public class TractorDAOImpl implements TractorDAO {
	private SessionFactory factory;

	public TractorDAOImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void saveTractor(TractorDTO dto) {
		System.out.println("invoked saveTractor()");
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
			System.out.println("dto is saved");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
	}

}
