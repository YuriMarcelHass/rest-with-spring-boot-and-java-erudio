package dev.hass.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {

	private static final long serialVersionUID = 8698581771855526435L;
	
	public UnsupportedMathOperationException(String ex) {
		super(ex);
	}

}
