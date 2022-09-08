package com.radu.restclientexample.service;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.radu.restclientexample.domain.User;

@Service
public class ApiServiceImpl implements ApiService {

	final private RestTemplate restTemplate;

	public ApiServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers() {
		User[]  users = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users",
				                                  User[].class).getBody();
		return Arrays.asList(users);
	}	
}
