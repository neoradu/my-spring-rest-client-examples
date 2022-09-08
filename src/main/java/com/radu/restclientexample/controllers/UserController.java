package com.radu.restclientexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.radu.restclientexample.service.ApiService;

@Controller
public class UserController {

	private final ApiService apiService;

	public UserController(ApiService apiService) {
		super();
		this.apiService = apiService;
	}
	
	@GetMapping({"/","index","index.html"})
	public String getUsers(Model model) {
		
		model.addAttribute("users", apiService.getUsers());
		return "listUsers";
	}
}
