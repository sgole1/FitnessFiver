package com.bodyrocks.services;

import java.util.List;

import com.bodyrocks.model.GymDetails;

public interface DataServices {
	public boolean addEntity(GymDetails employee) throws Exception;
	public GymDetails getEntityById(long id) throws Exception;
	public List<GymDetails> getEntityList(String city, String location) throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
