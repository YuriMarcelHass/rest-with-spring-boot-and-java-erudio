package dev.hass.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 6686076193820349045L;
	
	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	Date getTimestamp() {
		return timestamp;
	}
	
	String getMessage() {
		return message;
	}
	
	String getDetails() {
		return details;
	}
}
