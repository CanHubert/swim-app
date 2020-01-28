package com.swim.app.dao;

import org.hibernate.SessionFactory;

@FunctionalInterface
public interface IBaseDao {
	SessionFactory getSessionFactory();
}
