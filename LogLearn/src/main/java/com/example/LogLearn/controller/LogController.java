package com.example.LogLearn.controller;

import com.example.LogLearn.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/logs")
@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping
    public ResponseEntity<String> createLog(){
        logService.createLog();
//        logService.processPayment("123456");
        return ResponseEntity.ok("Log Created");
    }
}
