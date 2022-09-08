package com.radu.restclientexample.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplateBuilder getRestTemplateBuilder() {
		return new RestTemplateBuilder();
	}
	
	@Bean//Indicates that a method produces a bean to be managed by the Spring container.
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		
		return builder.build();
	}
}
