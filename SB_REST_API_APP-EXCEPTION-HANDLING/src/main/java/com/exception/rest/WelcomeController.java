package com.exception.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		int i=10/0;
		return new ResponseEntity<>("Welcome",HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet(){
		String s=null;
		s.length();
		return new ResponseEntity<>("Welcome",HttpStatus.OK);
	}
	
//	@ExceptionHandler(value = ArithmeticException.class)
//	public ResponseEntity<String> arthmaticExceptionHandler(ArithmeticException ex){
//		return new ResponseEntity<>("Not allowed divide by zero...!",HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	
//	@ExceptionHandler(value = NullPointerException.class)
//	public ResponseEntity<String> NullPointerExceptionHandler(NullPointerException ex){
//		return new ResponseEntity<>("Operation not allowed on null reference...!",HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}
