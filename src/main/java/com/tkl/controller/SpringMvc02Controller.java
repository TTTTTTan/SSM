package com.tkl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringMvc02Controller {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "springmvc02/index";
	}

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/pages/springmvc02/final.html";
	}
}
