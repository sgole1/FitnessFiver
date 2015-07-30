package com.bodyrocks.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.bodyrocks.model.GymDetails;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(GymDetails jimDetail) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(jimDetail);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public GymDetails getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		GymDetails jimDetail = (GymDetails) session.load(GymDetails.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return jimDetail;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GymDetails> getEntityList(String city, String location) throws Exception {
		
		System.out.println("city :"+city);
		System.out.println("location:"+location);
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria gymsListCriteria = session.createCriteria(GymDetails.class);
		if(!city.isEmpty()){
			gymsListCriteria =	gymsListCriteria.add(Restrictions.like("city", city));
		}
		if(!location.isEmpty()){
			gymsListCriteria =	gymsListCriteria.add(Restrictions.like("location", location));
		}
		List<GymDetails> gymsList =	gymsListCriteria.list();
		tx.commit();
		session.close();
		return gymsList;
	}
	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(GymDetails.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
