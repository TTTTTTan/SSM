package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.User;

@Controller
public class SpringMvc01Controller {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		// ��Ϊ�����JSP��ʹ��<form��form>��ǩ��spring�����Ҫһ����Ϊ��command���Ķ����ļ�
		return new ModelAndView("springmvc01/user", "command", new User());
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("name", user.getName());
		model.addAttribute("age", user.getAge());
		model.addAttribute("id", user.getId());
		model.addAttribute("passWord", user.getPassWord());
		return "springmvc01/result";
	}
}
