package com.by.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.by.dao.UserDaoMapper;
import com.by.entity.DevUser;

@Service
public class UserService {
	@Autowired
	private UserDaoMapper userDaoMapper;
	
	public DevUser selectUser(String devCode){
		return userDaoMapper.selectUser(devCode);		
	}
}
