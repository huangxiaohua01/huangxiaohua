package cn.com.city.dao;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import org.springframework.stereotype.Repository;

import cn.com.city.bean.UserBean;


@Repository
public class UserDAOIpml extends SqlSessionDaoSupport implements IUserDAO  {
	
	private static final String USERMAPPER="cn.com.city.mapper.UserMapper.";
	
	@Override
	public void addUser(UserBean user) {
		this.getSqlSession().insert(USERMAPPER+"addUser", user);
		
	}

	@Override
	public List<UserBean> queryUser() {
		
		return this.getSqlSession().selectList(USERMAPPER+"queryUser");
	}
	




}
