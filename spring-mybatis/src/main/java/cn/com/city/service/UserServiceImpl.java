package cn.com.city.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.city.bean.UserBean;
import cn.com.city.dao.IUserDAO;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired(required=true)
	private IUserDAO userDAO;
	
	
	public IUserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}


	@Override
	public void addUser(UserBean user) {
		userDAO.addUser(user);
		
	}


	@Override
	public List<UserBean> queryUser() {
	
		return 	userDAO.queryUser();
	}

}
