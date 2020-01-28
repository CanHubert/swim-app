package com.swim.app.dao;

import java.util.List;

import org.hibernate.query.Query;

public interface IBaseCrudDao<MODEL> extends IBaseDao{

	MODEL find(Long id);
	
	List<MODEL> findAll();
	
	MODEL save(MODEL model);
	
	@SuppressWarnings("rawtypes")
	Query createQuery(String query);
	
	@SuppressWarnings("rawtypes")
	Query createQueryWithOneParameter(String field, Object parameter);
}
