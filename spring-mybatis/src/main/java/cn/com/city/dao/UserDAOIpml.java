package cn.com.city.dao;


import org.mybatis.spring.support.SqlSessionDaoSupport;

import org.springframework.stereotype.Repository;

import cn.com.city.bean.UserBean;


@Repository
public class UserDAOIpml extends SqlSessionDaoSupport implements IUserDAO  {
	
	
	@Override
	public void addUser(UserBean user) {
		this.getSqlSession().insert("cn.com.city.mapper.UserMapper.addUser", user);
		
	}





}
