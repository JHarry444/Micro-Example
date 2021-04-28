package com.qa.gateway.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.gateway.service.GatewayService;

@RestController
public class GatewayController {

	private GatewayService service;

	public GatewayController(GatewayService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getMessage")
	public String getMessage() {
		return this.service.getMessage();
	}
}
