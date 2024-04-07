package com.group1.ipc.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.ipc.dtos.MessageDTO;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

	@GetMapping("/logged-in")
	public MessageDTO loggedIn(Authentication authentication) {
		boolean loggedIn = authentication != null;
		return new MessageDTO(String.valueOf(loggedIn));
	}
	
}
