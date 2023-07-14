package com.example.kafkaproducer.model;

public record MessageRequest(String topic, String message) {
}
