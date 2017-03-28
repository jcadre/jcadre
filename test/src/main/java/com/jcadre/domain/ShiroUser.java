/**
 * shiro用户对象
 */
package com.jcadre.domain;

import java.io.Serializable;

/**
 * @author JC
 * 2017年3月28日
 */
public class ShiroUser implements Serializable {
	private static final long serialVersionUID = -670662205271289821L;
	
	private String loginName;  
    private String nickName;  

    public ShiroUser(String loginName, String nickName) {  
        this.loginName = loginName;  
        this.nickName = nickName;  
    }  

    public String getLoginName() {  
        return loginName;  
    }  

    /** 
     * 本函数输出将作为默认的<shiro:principal/>输出. 
     */  
    @Override  
    public String toString() {  
        return loginName;  
    }  

    public String getNickName() {  
        return nickName;  
    }  
}
