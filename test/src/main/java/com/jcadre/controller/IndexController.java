/**
 * 主页控制层
 */
package com.jcadre.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JC
 * 2017年3月28日
 */
@Controller
public class IndexController {
	/**
	 * 主页
	 * @return
	 */
	@RequestMapping(value="/index")
	public String index() {
        return "index";
	}
	
	/**
	 * 登录页
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/login")
	public String login(HttpServletResponse response) throws IOException {
		Subject currentUser = SecurityUtils.getSubject();
		if (currentUser != null && currentUser.isAuthenticated()) {  
			response.sendRedirect("index");
	    }
        return "login";
	}
	
	/**
	 * 未授权
	 * @return
	 */
	@RequestMapping(value="/unauthorized")
	public String unauthorized() {
        return "unauthorized";
	}
}
