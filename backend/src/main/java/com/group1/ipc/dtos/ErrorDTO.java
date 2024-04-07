package com.group1.ipc.dtos;

public class ErrorDTO {

	private String message;
	
	public ErrorDTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
