/**
 * 人员业务实现
 */
package com.jcadre.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcadre.domain.User;
import com.jcadre.mapper.UserMapper;
import com.jcadre.service.IUserService;

/**
 * @author JC
 * 2017年3月28日
 */
@Service
public class UserService implements IUserService {
	@Resource
	private UserMapper userMapper;

	@Override
	@Transactional(readOnly=true)
	public User checkPwd(String loginName, String password) {
		User user = userMapper.findUserByLoginName(loginName);
		if(user != null)
		{
			if(!user.getPassword().equals(password)){
				user = null;
			}
		}
		return user;
	}

	@Override
	@Transactional(readOnly=true)
	public User findUserByLoginName(String loginName){
		return userMapper.findUserByLoginName(loginName);
	}

	@Override
	@Transactional
	public void createUser(User user) {
		userMapper.createUser(user);
	}
}
