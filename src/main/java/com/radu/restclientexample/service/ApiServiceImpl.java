package com.radu.restclientexample.service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.radu.restclientexample.domain.User;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ApiServiceImpl implements ApiService {

	final private RestTemplate restTemplate;
	final private String apiUrl;
	public ApiServiceImpl(RestTemplate restTemplate,@Value("${api.url}") String apiUrl) {
		super();
		this.restTemplate = restTemplate;
		this.apiUrl = apiUrl;
	}

	@Override
	public List<User> getUsers() {
		User[]  users = restTemplate.getForEntity(apiUrl, User[].class).getBody();
		return Arrays.asList(users);
	}
	/* WebClient
	 * Non-blocking, reactive client to perform HTTP requests, exposing a fluent, 
	 * reactive API over underlying HTTP client libraries such as Reactor Netty.
     * Use static factory methods create() or create(String), or WebClient.builder() to prepare an instance.
	 * For examples with a response body see:
     * retrieve() exchangeToMono() exchangeToFlux() */
	@Override
	public Flux<User> getUsers(Mono<Integer> limit) {
		log.debug("--> Flux<User> getUsers(Mono<Integer> limit)");
		Flux<User> users = WebClient.create(apiUrl)
								     .get()
								     .accept(MediaType.APPLICATION_JSON)
								     .exchangeToFlux((response) -> { return response.bodyToFlux(User.class);})
								     .filter(user -> {
										try {
											return user.getId() <= limit.toFuture().get();
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										} catch (ExecutionException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										return false;
									});
								     
		log.debug("<-- Flux<User> getUsers(Mono<Integer> limit)");
		return users;
	}	
}
