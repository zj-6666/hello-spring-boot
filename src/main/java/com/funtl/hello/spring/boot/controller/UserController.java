package com.funtl.hello.spring.boot.controller;
import java.util.List;
import com.funtl.hello.spring.boot.pojo.User;
import com.funtl.hello.spring.boot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<User> list = userService.findUserList();
		for (User user : list) {
			model.addAttribute("list",list);
		}
		return "index";
	}
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "user/userAdd";
	}

	@RequestMapping("/add")
	public String add(User user) {
		userService.addUser(user);
		return "redirect:/list";
	}

	//修改user数据
	@RequestMapping("/toEdit")
	public String toUpdate(Model model,User user) {
		int count= userService.updateUser(user);
		model.addAttribute("user", user);
		return "user/userEdit";
	}

	@RequestMapping("/edit")
	//@ResponseBody
	public String update(User user) {
		userService.updateUser(user);
		return "redirect:/";
	}

	//删除user数据
	@RequestMapping("/delete")
	public String delete(Integer id) {
		userService.deleteUser(id);
		return "redirect:/list";
	}
}
