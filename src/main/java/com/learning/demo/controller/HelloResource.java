package com.learning.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

	@Value("${testuser.name}")
	private String name;

	@GetMapping
	public String hello() {
		return "Hello " + name + " World: " + HttpStatus.OK.value();
	}

	@PostMapping("/post")
	public String helloPost(@RequestBody final String hello) {
		return "name: " + hello;
	}

	@PutMapping("/put")
	public String helloPut(@RequestBody final String hello) {
		return "name: " + hello;
	}
}