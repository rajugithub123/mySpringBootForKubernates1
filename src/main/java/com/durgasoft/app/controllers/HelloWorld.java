package com.durgasoft.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping(value="/hello")
	public String getMessage() {
		return "hello kubernates";
	}

}
