package com.mhj.demo_332.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mhj.demo_332.exception.ServerErrorException;

@ControllerAdvice
public class ServerErrorAdvice {

	@ResponseBody
	@ExceptionHandler(ServerErrorException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	String eserverErrorHandler(ServerErrorException ex) {
		return ex.getMessage();
	}

}
