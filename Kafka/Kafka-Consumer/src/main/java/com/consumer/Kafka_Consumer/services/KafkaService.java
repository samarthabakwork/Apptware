package com.consumer.Kafka_Consumer.services;

import com.consumer.Kafka_Consumer.model.Course;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

   private String message;

    @KafkaListener(topics="telusko")
    public void consume(Course course){

        message=course +" Got the data from kafka";
        System.out.println(message);

    }

    public String getMessage() {
        return message;
    }


}
