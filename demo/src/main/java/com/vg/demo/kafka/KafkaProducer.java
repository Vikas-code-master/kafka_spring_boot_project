package com.vg.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate kafkaTemp) {
		this.kafkaTemplate = kafkaTemp;
	}
	
	public void sendMsg (String msg) {
		LOGGER.info("send msg is {} :", msg);
		kafkaTemplate.send("testtopic", msg);
	}
	
	public static void main(String[] args) {
		LOGGER.info(" send msg is {} :", "hiiiihdkshd");
	}

}
