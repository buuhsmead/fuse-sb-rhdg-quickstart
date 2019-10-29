package br.com.redhat.poc.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Classe comum para retorno 
 * @author rosantos
 *
 */
public class ResponseBaseDTO implements Serializable {
	
	private LocalDateTime timestamp;

	private int httpStatus;

	private String message;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
