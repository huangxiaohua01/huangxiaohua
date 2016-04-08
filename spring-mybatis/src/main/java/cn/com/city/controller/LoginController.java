package cn.com.city.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String login(HttpServletRequest request,HttpServletResponse response, UserBean userBean,Model model){
		
		userService.addUser(userBean);
		List<UserBean> userList=userService.queryUser();
		model.addAttribute("user", userList);
		return "main";
	}
	
	@RequestMapping(value="/getAll",method = RequestMethod.GET)
	public String getUser(HttpServletRequest rquest,HttpServletResponse response){
		List<UserBean> userList=userService.queryUser();
		JSONObject json =new JSONObject(userList.get(0));
		return json.toString();
	}
}
