/**
 * 测试Controller
 */
package com.goldwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JC 2017年3月13日
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello, world! This com from spring!";
	}

}
