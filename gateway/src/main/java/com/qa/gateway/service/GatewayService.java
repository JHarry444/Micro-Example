package com.qa.gateway.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GatewayService {

	private RestTemplate rest;

	public GatewayService(RestTemplateBuilder builder) {
		this.rest = builder.build();
	}

	public String getMessage() {
		// sending a GET request to my message API
		String message = "The message is: " + this.rest.getForObject("http://localhost:8888/makeMessage", String.class);
		return message;
	}
}
