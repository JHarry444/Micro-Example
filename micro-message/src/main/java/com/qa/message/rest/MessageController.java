package com.qa.message.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.message.service.MessageService;

@RestController
public class MessageController {

	private MessageService service;

	public MessageController(MessageService service) {
		super();
		this.service = service;
	}

	@GetMapping("/makeMessage")
	public String getMessage() {
		return this.service.makeMessage();
	}
}
