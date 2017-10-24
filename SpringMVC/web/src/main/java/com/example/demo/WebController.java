package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class WebController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "helloHome";
	}
	
	@RequestMapping("/jsp")
	public String hello(Model model){
		model.addAttribute("name", "jinhyeon");
		
		return "hello";
	}
}
