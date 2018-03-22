package com.zhihui.service;

import com.zhihui.domain.User;

public interface UserService {
	
	/**
	 * 判断用户是否存在
	 * @param user
	 * @return
	 */
	public boolean checkUser(User user);
	
	/**
	 * 根据id获取user
	 * @param id
	 * @return
	 */
	public User getUserById(int id);
	
	/**
	 * 根据userName获取user
	 * @param userName
	 * @return
	 */
	public User findUserByUserName(String userName);
}
