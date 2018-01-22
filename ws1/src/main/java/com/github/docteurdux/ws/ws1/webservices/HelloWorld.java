package com.github.docteurdux.ws.ws1.webservices;

import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	private static final String HI = "Hi !";

	public String hi() {
		return HI;
	}
}