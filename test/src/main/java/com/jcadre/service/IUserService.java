/**
 * 人员业务接口
 */
package com.jcadre.service;

import com.jcadre.domain.User;

/**
 * 人员业务接口
 * @author JC
 * 2017年3月28日
 */
public interface IUserService {
	/**
	 * 校验用户密码
	 * @param loginName 登录名
	 * @param password 密码
	 * @return User
	 */
	public User checkPwd(String loginName, String password);
	
	/**
	 * 根据用户名查询用户
	 * @param loginName 用户名
	 * @return
	 */
	public User findUserByLoginName(String loginName);
}
