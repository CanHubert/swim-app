package com.swim.app.dao;

import com.swim.app.entity.Role;
import com.swim.app.enums.EnumRole;

public interface IRoleDao extends IBaseCrudDao<Role>{
	Role findByName(EnumRole role);
}
