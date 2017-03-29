/**
 * 用户持久层
 */
package com.jcadre.mapper;

import com.jcadre.domain.User;

/**
 * @author JC
 * 2017年3月29日
 */
public interface UserMapper {
	/**
	 * 新增人员
	 * @param user 人员对象
	 */
	public void createUser(User user);
	
	/**
	 * 根据登录名查询用户
	 * @param loginName 登录名
	 * @return User
	 */
	public User findUserByLoginName(String loginName);
}
