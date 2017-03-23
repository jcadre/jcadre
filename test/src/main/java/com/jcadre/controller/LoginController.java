/**
 * 测试Controller
 */
package com.jcadre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jcadre.domain.User;

/**
 * @author JC 2017年3月13日
 */
@Controller
public class LoginController {
	@RequestMapping(value="/login")
	@ResponseBody
	public User hello(String name, String password) {
		User user = new User(name, password);
		return user;
	}
	
	@RequestMapping(value="/loginHtml")
	public String login() {
		return "login";
	}
}
