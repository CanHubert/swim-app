package com.swim.app.dao;

import com.swim.app.entity.User;

public interface IUserDao extends IBaseCrudDao<User> {

	User findByEmail(String email);
	
	User findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);

}
