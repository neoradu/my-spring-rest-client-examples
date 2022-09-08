package com.radu.restclientexample.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.radu.restclientexample.domain.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceTest {
	
	@Autowired
	private ApiService apiService;
	
	@BeforeEach
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testGetUsers() throws Exception {
		List<User> users = apiService.getUsers();
		
		log.error(users.get(0).toString());
		assertNotEquals(0, users.size());
		
	}
}
