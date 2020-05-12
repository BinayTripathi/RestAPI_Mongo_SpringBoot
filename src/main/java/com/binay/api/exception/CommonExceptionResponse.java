package com.binay.api.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
public class CommonExceptionResponse {
	private String message;
	private String details;
	private Date timestamp;

}
