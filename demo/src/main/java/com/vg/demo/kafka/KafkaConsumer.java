package com.vg.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics ="testtopic", groupId="myGroup")
	public void consume(String msg) {
		LOGGER.info("send msg is {} ", msg);
		
	}

}
