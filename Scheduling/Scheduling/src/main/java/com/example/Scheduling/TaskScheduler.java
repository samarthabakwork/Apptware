package com.example.Scheduling;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskScheduler {

    @Scheduled(fixedRate = 5000)
    public void printTime(){
        System.out.println("Task executed at: "+ LocalDateTime.now());
    }

    @Scheduled(fixedDelay = 5000)
    public void task() throws InterruptedException {

        System.out.println("Started");

        Thread.sleep(3000);

        System.out.println("Finished");
    }

    @Scheduled(initialDelay = 10000, fixedRate = 5000)
    public void taskTwo() {
        System.out.println("Started after 10 seconds");
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void taskThree() {
        System.out.println("Task 3 : " + LocalDateTime.now());
    }
}
