package com.organizer.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}
}
