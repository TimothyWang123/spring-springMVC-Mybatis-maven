package com.zhihui.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.dao.UserDao;
import com.zhihui.domain.User;
import com.zhihui.service.UserService;

@Service("userService") // 这里的注解不要忘记了
public class UserServiceImpl implements UserService {

	@Autowired
	@Resource
	private UserDao userDao;
	
	public boolean checkUser(User user) {
		
		User userResult = userDao.findUserByUserName(user.getUserName());
		if(userResult == null){
			return false;
		}else if(userResult.getPassWord().equals(user.getPassWord())){
			return true;
		}else{
			return false;
		}
		
	}

	public User getUserById(int id) {
		return userDao.findUserById(id);
	}

	public User findUserByUserName(String userName) {
		return userDao.findUserByUserName(userName);
	}


}
