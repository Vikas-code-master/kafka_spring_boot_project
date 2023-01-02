package com.vg.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vg.demo.kafka.KafkaProducer;

@RestController
@RequestMapping("/msg")
public class MsgController {
	
	private  KafkaProducer kafkaProducer;
	
	public MsgController (KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}

//	http://localhost:8080/msg/send?message=hellooo
	
	@GetMapping("/send")
	public ResponseEntity<String> publish (@RequestParam("message") String str){
		kafkaProducer.sendMsg(str);
		return ResponseEntity.ok("msg is sent to topic");
	}
}
