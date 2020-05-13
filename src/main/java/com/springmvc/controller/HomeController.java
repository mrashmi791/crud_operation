package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.models.ShowMessage;

/**
 * 
 * @author Rashmi
 *
 */
@Controller
public class HomeController {

	@RequestMapping("hello-world")
	public String helloWorldPage(Model model) {

		ShowMessage messageObj = new ShowMessage();
		messageObj.setMessage("Welcome to the spring mvc world..!");
		model.addAttribute("data", messageObj);
		return "helloworld";
	}
}
