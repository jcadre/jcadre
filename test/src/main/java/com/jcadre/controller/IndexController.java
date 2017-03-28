/**
 * 主页控制层
 */
package com.jcadre.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JC
 * 2017年3月28日
 */
public class IndexController {
	@RequestMapping(value="/index")
	public String index() {
        return "index";  
	}
}
