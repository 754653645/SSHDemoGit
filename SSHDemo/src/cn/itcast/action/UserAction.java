package cn.itcast.action;

import cn.itcast.model.User;
import cn.itcast.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
		private User user = new User();
		public User getModel(){
			return this.user;
		}
		private UserService userService;
		public void setUserService(UserService userService) {
			this.userService=userService;
		}
		public String add(){
			this.userService.saveUser(user);
			return "add";
		}
}
