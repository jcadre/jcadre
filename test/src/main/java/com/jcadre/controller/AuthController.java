/**
 * 认证相关Controller
 */
package com.jcadre.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jcadre.domain.ShiroUser;

/**
 * 认证控制层
 * @author JC 2017年3月13日
 */
@Controller
@RequestMapping(value = "/auth")  
public class AuthController {
	/**
	 * 登录
	 * @param loginName 登录名
	 * @param password 密码
	 * @return 成功与否
	 */
	@RequestMapping(value="/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password) {
		Subject currentUser = SecurityUtils.getSubject();  
        String result = "login";  
        if (!currentUser.isAuthenticated()) {  
            result = login(currentUser,loginName,password);  
        }else{//重复登录
            ShiroUser shiroUser = (ShiroUser) currentUser.getPrincipal();  
            if(!shiroUser.getLoginName().equalsIgnoreCase(loginName)){//如果登录名不同  
                currentUser.logout();  
                result = login(currentUser,loginName,password);  
            }  
        }  
        return result;  
	}
	
	private String login(Subject currentUser,String loginName,String password){  
        String result = "login";  
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);  
        token.setRememberMe(false);  
        try {  
            currentUser.login(token);  
            result = "success";  
        } catch (UnknownAccountException uae) {  
            result = "failure";  
        } catch (IncorrectCredentialsException ice) {  
            result = "failure";  
        } catch (LockedAccountException lae) {  
            result = "failure";  
        } catch (AuthenticationException ae) {  
            result = "failure";  
        }  
        return result;  
    }
	
	/**
	 * 注销
	 * @return 
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.POST)  
    @ResponseBody  
    public String logout() {  
        Subject currentUser = SecurityUtils.getSubject();  
        String result = "logout";  
        currentUser.logout();  
        return result;  
    } 
}
