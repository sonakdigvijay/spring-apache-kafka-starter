package com.learning.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Value("${producer.topic}")
    private String KAFKA_PRODUCER_TOPIC;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishMessage(String message) {
        this.kafkaTemplate.send(KAFKA_PRODUCER_TOPIC, message);
    }
}
