package cn.com.city.dao;

import java.util.List;

import cn.com.city.bean.UserBean;

public interface IUserDAO {
	void addUser(UserBean user);
	
	List<UserBean> queryUser();
}