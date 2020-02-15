package com.learning.kafka.producer.controller;

import com.learning.kafka.producer.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    private Logger logger = LoggerFactory.getLogger(KafkaProducerController.class);

    private final KafkaProducerService producer;

    @Autowired
    public KafkaProducerController(KafkaProducerService producer) {
        this.producer = producer;
    }

    @RequestMapping(value = "/marco")
    public String marco() {
        return "polo";
    }

    @PostMapping(value = "/sendit")
    public void publishMessageToKafkaTopic(@RequestParam("message") String message) {
        logger.info("mesage to send: " + message);
        producer.publishMessage(message);
    }
}
