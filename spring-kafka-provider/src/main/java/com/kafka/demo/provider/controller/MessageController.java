package com.kafka.demo.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/messages")
	public ResponseEntity<Object> enviaMensaje(@RequestHeader(name="x-message") String mensaje) {
		
		kafkaTemplate.send("bitacora-dev", mensaje);
		
		return ResponseEntity.ok("success");
	}
}
