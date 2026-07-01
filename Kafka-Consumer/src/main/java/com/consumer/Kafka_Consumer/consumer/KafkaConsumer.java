package com.consumer.Kafka_Consumer.consumer;

import com.consumer.Kafka_Consumer.dto.EmployeeDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

@Component
public class KafkaConsumer {
    public static final String EMPLOYEE_TOPIC="employee_topic";

    private final ObjectMapper objectMapper;

    public KafkaConsumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics= EMPLOYEE_TOPIC)
    public void consume(String message){
        EmployeeDTO employee=objectMapper.readValue(message, EmployeeDTO.class);


        System.out.println("==================");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        System.out.println(employee.getCompany());
        System.out.println(employee.getAddress().getCity());
        System.out.println("==================");
    }
}
