package com.zhihui.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhihui.domain.User;
import com.zhihui.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/test")
public class UserController {
	
	@Autowired  
	private UserServiceImpl userService;
	
	/**
	 * 登陆方法
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(password);
		boolean result = userService.checkUser(user);
		if(result){
			return "/success";//返回的页面 
		}else{
			return "/fail";  
		}
		
	}
	
}
