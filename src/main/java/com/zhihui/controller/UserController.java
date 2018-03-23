package com.zhihui.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhihui.domain.User;
import com.zhihui.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired  
	private UserServiceImpl userService;
	
	/**
	 * 登陆方法
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody //如果你返回的东西不是jsp页面名字的话，不然一直去找这个jsp存不存在，人都气死
	public Map<String,String> login(HttpServletRequest request){
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(password);
		boolean result = userService.checkUser(user);
		Map<String,String> resultMap = new HashMap<String, String>();
		if(result){
			resultMap.put("result", "success");
			return resultMap;//返回的页面 
		}else{
			resultMap.put("result", "false");
			return resultMap;  
		}
		
	}
	
	@RequestMapping("/toLoginSuccess")
	public String toLoginSuccess(){
		
		return "/success";
	}
	
	@RequestMapping("/toLoginFail")
	public String toLoginFail(){
		
		return "/fail";
	}
	
}
