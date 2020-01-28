package com.swim.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseCrudDao<MODEL> extends BaseDao implements IBaseCrudDao<MODEL> {

	final private Class<MODEL> clazz;
		
	public BaseCrudDao(Class<MODEL> type) {

		if (type == null) {
			throw new IllegalArgumentException("type cannot be null");
		}
		this.clazz = type;
	}
	
	protected Session getSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	@Override
	public MODEL find(Long id) {
		return getSession().find(clazz, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MODEL> findAll(){
		List<MODEL> list = getSession().createQuery("from " + clazz.getName()).getResultList();
		return list;
	}
	
	@Override
	public MODEL save(MODEL model) {
		getSession().saveOrUpdate(model);
		return model;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Query createQuery(String query) {
		return getSession().createQuery(query);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Query<MODEL> createQueryWithOneParameter(String field, Object parameter) {
		String q = String.format("from %s where %s=:%s", clazz.getName(), field, field);
		Query query = getSession().createQuery(q);
		query.setParameter(field, parameter);
		return query;
	}
	
}
