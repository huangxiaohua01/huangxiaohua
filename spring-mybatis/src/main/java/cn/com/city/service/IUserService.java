package cn.com.city.service;

import java.util.List;

import cn.com.city.bean.UserBean;

public interface IUserService {
	void addUser(UserBean user) ;
	
	 List<UserBean> queryUser();
}