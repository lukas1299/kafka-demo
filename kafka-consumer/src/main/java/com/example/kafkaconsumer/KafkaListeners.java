package com.example.kafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
@Slf4j
public class KafkaListeners {
    @KafkaListener(topics = "new-topic2", groupId = "groupId")
    void listener(String data) {
        log.info("Event: " + data);
    }
}
