package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.MessageRequest;
import com.example.kafkaproducer.service.ProducerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProducerAPI {

    private final ProducerService producerService;

    @PostMapping("/sendMessage")
    public void sendMessage(@RequestBody MessageRequest messageRequest){
        producerService.sendMessage(messageRequest.topic(), messageRequest.message());
    }
}
