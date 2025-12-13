package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/api/greeting")
    public Map<String, Object> greeting() throws Exception {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello from GKE Spring Boot Demo 🚀");
        response.put("hostname", InetAddress.getLocalHost().getHostName());
        return response;
    }
}
