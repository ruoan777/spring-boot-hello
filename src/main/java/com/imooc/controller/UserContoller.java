package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @RestController = @Controller + @ResponseBody
 */
@RestController
@RequestMapping("/user")
public class UserContoller {

	@RequestMapping("/getUser")
	public User getUser() {
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		return u;
	}

	@RequestMapping("/getUserJson")
	public IMoocJSONResult getUserJson() {
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~hello imooc~~");
		return IMoocJSONResult.ok(u);
	}
}
