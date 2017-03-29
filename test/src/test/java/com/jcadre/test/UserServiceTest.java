/**
 * 用户测试类
 */
package com.jcadre.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jcadre.domain.User;
import com.jcadre.service.IUserService;

/**
 * @author JC
 * 2017年3月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource("classpath:*.properties")
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceTest {
	@Autowired
	private IUserService userService;
	
	@Test
    public void checkPwdTest() {
		User user = userService.checkPwd("jiangchao", "123456");
		System.out.println(user);
	}
}
