package com.binay.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ModifiedEntityNotFoundException extends RuntimeException {

	public ModifiedEntityNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
