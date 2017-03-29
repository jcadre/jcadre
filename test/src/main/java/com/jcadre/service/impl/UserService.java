/**
 * 人员业务实现
 */
package com.jcadre.service.impl;

import org.springframework.stereotype.Service;

import com.jcadre.domain.User;
import com.jcadre.service.IUserService;

/**
 * @author JC
 * 2017年3月28日
 */
@Service
public class UserService implements IUserService {

	@Override
	public User checkPwd(String loginName, String password) {
		return new User("1", loginName, password, "超哥", 1);
	}

	@Override
	public User findUserByLoginName(String loginName){
		return new User("1", loginName, "123456", "超哥", 1);
	}
}
