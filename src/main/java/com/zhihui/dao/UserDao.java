package com.zhihui.dao;

import com.zhihui.domain.User;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository  
public interface UserDao {

	public User findUserById(int id); //使用ID来获取单个用户
	
	public User findUserByUserName(String userName); //使用用户名来获取单个用户
	
    public List<User> findUserAll();//获取全部用户
    
    public void insertUser(User user);//插入单条用户数据
    
    public void deleteUserById(int id);//使用ID来删除某一条用户
    
    public void updateUserPassword(User user);//更新用户密码
	
}