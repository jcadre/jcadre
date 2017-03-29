/**
 * 人员对象
 */
package com.jcadre.domain;

import java.io.Serializable;

/**
 * @author JC
 * 2017年3月13日
 */
public class User implements Serializable{
	private static final long serialVersionUID = 3468499677952682568L;
	
	private String id;
	private String loginName;
	private String password;
	private String nickName;
	private Integer sex;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public User(){}

	public User(String id, String loginName, String password, String nickName, Integer sex){
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.nickName = nickName;
		this.sex = sex;
	}
}
