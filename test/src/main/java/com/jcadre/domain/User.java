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
	private String name;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public User(){}

	public User(String id, String name){
		this.id = id;
		this.name = name;
	}
}
