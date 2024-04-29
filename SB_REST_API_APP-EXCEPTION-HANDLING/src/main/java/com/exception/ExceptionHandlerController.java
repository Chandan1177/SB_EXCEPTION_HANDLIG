package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<String> arthmaticExceptionHandler(ArithmeticException ex){
		return new ResponseEntity<>("Not allowed divide by zero...!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<String> NullPointerExceptionHandler(NullPointerException ex){
		return new ResponseEntity<>("Operation not allowed on null reference...!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
