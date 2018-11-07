package com.by.dao;

import com.by.entity.DevUser;

public interface UserDaoMapper {
	public DevUser selectUser(String devCode);
}
