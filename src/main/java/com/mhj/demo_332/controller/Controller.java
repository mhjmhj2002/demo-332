package com.mhj.demo_332.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhj.demo_332.dto.Test200Dto;
import com.mhj.demo_332.exception.ServerErrorException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path="/test", produces="application/json")
@CrossOrigin(origins="*") 
public class Controller {

	@GetMapping("test-200")
	public ResponseEntity<?> test200() {
		log.info("test 200");
		return ResponseEntity.ok(Test200Dto.builder().retorno("Retorno 200 ok").build());
	}

	@GetMapping("test-500")
	public void test500() throws ServerErrorException {
		log.error("test 500");
		throw new ServerErrorException("Erro interno servidor");
	}
}