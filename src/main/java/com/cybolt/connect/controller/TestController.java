package com.cybolt.connect.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/api", produces = { MediaType.APPLICATION_JSON_VALUE})
public class TestController {

	@GetMapping(value = "/test")
	public ResponseEntity<Object> getTest() {
		return new ResponseEntity<Object>("HOLA MUNDO", HttpStatus.OK);
	}
}