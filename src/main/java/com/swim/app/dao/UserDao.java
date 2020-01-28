package com.swim.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.swim.app.entity.User;

@Repository
@Transactional
public class UserDao extends BaseCrudDao<User> implements IUserDao {

	@Autowired
	public UserDao() {
		super(User.class);
	}
	
	@Override
	public User findByEmail(String email) {
//		Query<User> query = createQuery("Select User where email= :email");
//		query.setParameter("email", email);
		
		return createQueryWithOneParameter("email", email).getSingleResult();
	}
	
	@Override
	public User findByUsername(String username) {
//		Query<User> query = createQuery("Select User where username= :username");
//		query.setParameter("username", username);
		return createQueryWithOneParameter("username", username).getSingleResult();
	}

	@Override
	public Boolean existsByUsername(String username) {
		return null != findByUsername(username);
	}

	@Override
	public Boolean existsByEmail(String email) {
		return null != findByEmail(email);
	}
	
	


}
