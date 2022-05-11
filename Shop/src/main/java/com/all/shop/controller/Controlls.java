package com.all.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.all.shop.model.Me;

@Controller
@RequestMapping("/main")
public class Controlls {
	@GetMapping("/index")
	public String ind()
	{
		return("me");
	}
	
	

}
