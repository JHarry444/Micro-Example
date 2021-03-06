package com.qa.gateway.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GatewayService {

	private RestTemplate rest;

	public GatewayService(RestTemplate rest) { // injecting the bean into my service
		this.rest = rest;
	}

	public String getMessage() {
		// sending a GET request to my message API
		String message = "The message is: " + this.rest.getForObject("http://message-api/makeMessage", String.class);
		return message;
	}
}
