/**
 * 用户测试类
 */
package com.jcadre.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jcadre.constant.UserConstant;
import com.jcadre.domain.User;
import com.jcadre.service.IUserService;
import com.jcadre.utils.CommonUtil;

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
	
	//@Test
	public void checkPwdTest(){
		User user = userService.checkPwd("jiangchao", CommonUtil.getMD5("123s456"));
		System.out.println(user);
	}
	
	//@Test
    public void createUserTest() throws ParseException {
		String input = "1990-04-24"; //这个客户端输入
		//把用户输入的日期转成 java 日期类
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(input);
		User user = new User(CommonUtil.getUUID(), "jiangchao", CommonUtil.getMD5("123456"), "蒋超", UserConstant.SEX_MAN, date);
		user.setStatus(UserConstant.STATUS_NORMAL);
		userService.createUser(user);
		System.out.println(user);
	}
}
