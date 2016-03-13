package cn.com.city.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.city.bean.UserBean;
import cn.com.city.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired(required=true)
	private IUserService userService;
	
	
	
	public IUserService getUserService() {
		return userService;
	}



	public void setUserService(IUserService userService) {
		this.userService = userService;
	}



	@RequestMapping(method = RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response, UserBean userBean){
		try {
			userService.addUser(userBean);
			response.getWriter().write("success");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}