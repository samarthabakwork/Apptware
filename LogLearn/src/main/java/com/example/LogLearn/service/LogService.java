package com.example.LogLearn.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {

//    private final Logger logger= LoggerFactory.getLogger(LogService.class);

    public void createLog(){
//        logger.info("create service log is here!");
        log.info("create service log is here!");
        log.warn("Invalid input!!");
        log.error("Database failed");

        log.debug("Debugging data");
        log.trace("Very detail data");
    }

    public void processPayment(String orderId){
        log.info("Payment started for order {}",orderId);
        try{
            log.debug("calling payment gateway...");
            if(2<5){
                throw new RuntimeException("payment server is down");
            }


            log.info( "Payment successful for order id {}",orderId);
        }catch(Exception e){
            log.error("Payment failed for order {}",orderId,e);
        }
    }

}
