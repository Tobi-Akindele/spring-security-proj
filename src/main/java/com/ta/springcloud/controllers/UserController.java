package com.ta.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ta.springcloud.security.ISecurityService;

@Controller
public class UserController {

	@Autowired
	private ISecurityService securityService;
	
	@GetMapping("/")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String email, String password) {
		boolean loggedIn = securityService.login(email, password);
		return loggedIn ? "index" : "login";
	}
}
