package com.group1.ipc.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class ApiController {

	@GetMapping("/test")
	public String test() {
		return "It works on Windows and Mac!";
	}
	
}
