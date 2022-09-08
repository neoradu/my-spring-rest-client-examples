package com.radu.restclientexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;
import com.radu.restclientexample.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class UserController {

	private final ApiService apiService;

	public UserController(ApiService apiService) {
		super();
		this.apiService = apiService;
	}
	
	
	@GetMapping({"/","index","index.html"})
	public String index() {
		
		return "index";
	}
	
	/*
	 * org.springframework.web.server.ServerWebExchange
	 * Contract for an HTTP request-response interaction.
	 * Provides access to the HTTP request and response and also exposes additional
	 * server-side processing related properties and features such as request attributes.
	 **/
	@PostMapping("/users")
	public String getUsers(Model model, ServerWebExchange serverWebExchange) {
		log.debug("--> getUsers(Model model, ServerWebExchange serverWebExchange)");
		Mono<MultiValueMap<String,String>> mono = serverWebExchange.getFormData();

		model.addAttribute("users", 
				           apiService.getUsers(mono.map((map) -> Integer.valueOf(map.getFirst("limit")))));
		log.debug("<-- getUsers(Model model, ServerWebExchange serverWebExchange)");
		return "listUsers";
	}
}
