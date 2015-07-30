package com.bodyrocks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bodyrocks.dao.DataDao;
import com.bodyrocks.model.GymDetails;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEntity(GymDetails jim) throws Exception {
		return dataDao.addEntity(jim);
	}

	@Override
	public GymDetails getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<GymDetails> getEntityList(String city, String location) throws Exception {
		return dataDao.getEntityList(city, location);
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
