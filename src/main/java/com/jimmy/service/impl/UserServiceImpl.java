package com.jimmy.service.impl;

import com.jimmy.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jimmy.pojo.SysUser;
import com.jimmy.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private SysUserMapper userMapper;

	public void saveUser(SysUser user) {
		
	}

}
