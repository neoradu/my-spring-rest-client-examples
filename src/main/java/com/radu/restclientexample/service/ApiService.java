package com.radu.restclientexample.service;

import java.util.List;

import com.radu.restclientexample.domain.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {
	public List<User> getUsers();
	
	public Flux<User> getUsers(Mono<Integer> limit);
	
}
