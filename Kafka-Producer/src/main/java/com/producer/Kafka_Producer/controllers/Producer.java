package com.producer.Kafka_Producer.controllers;

import com.producer.Kafka_Producer.dto.EmployeeDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

@RestController
public class Producer {
    private final KafkaTemplate<String,Object> kafkaTemplate;
    private final ObjectMapper objectMapper;
    public static final String EMPLOYEE_TOPIC="employee_topic";

    public Producer(KafkaTemplate<String, Object> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    @PostMapping("/publish")
    public String publishMessageToKafka(@RequestBody EmployeeDTO employee){
        String employeeAsString= objectMapper.writeValueAsString(employee);
        kafkaTemplate.send(EMPLOYEE_TOPIC,employeeAsString);

        return "Message sent to Kafka";
    }
}
