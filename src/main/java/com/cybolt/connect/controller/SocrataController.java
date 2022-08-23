package com.cybolt.connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybolt.connect.service.SocrataService;

@RestController
@RequestMapping(value = "/api/socrata", produces = { MediaType.APPLICATION_JSON_VALUE })
public class SocrataController {

	@Autowired
	private SocrataService socrataService;

	@GetMapping(value = "/all")
	public ResponseEntity<Object> testSocrata() {
		return new ResponseEntity<Object>(socrataService.testSocrata(), HttpStatus.OK);
	}
}
