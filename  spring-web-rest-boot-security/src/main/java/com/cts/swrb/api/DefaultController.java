package com.cts.swrb.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/")
public class DefaultController {
	
	@GetMapping
	public ResponseEntity<String> defaultGetRequestHandler(){
		return new ResponseEntity<String>("a welcome msg",HttpStatus.OK);
	}
}
