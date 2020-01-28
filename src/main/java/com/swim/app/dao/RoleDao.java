package com.swim.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.swim.app.entity.Role;
import com.swim.app.enums.EnumRole;

@Repository
@Transactional
public class RoleDao extends BaseCrudDao<Role> implements IRoleDao{

	@Autowired
	public RoleDao() {
		super(Role.class);
	}

	@Override
	public Role findByName(EnumRole role) {
		return createQueryWithOneParameter("name", role).getSingleResult();
	}

}
