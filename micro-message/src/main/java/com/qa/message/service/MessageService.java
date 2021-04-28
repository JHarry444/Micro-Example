package com.qa.message.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

	public String makeMessage() {
		return "Hello, it is currently " + LocalTime.now();
	}
}
