package com.pingpong.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PingTask {

    private final RestTemplate restTemplate = new RestTemplate();

    // Schedule the ping task to run every 5 minutes
    @Scheduled(fixedRate = 300000) // 5 minutes in milliseconds
    public void pingServer() {
        String url = "http://localhost:8080/ping";
        try {
            String response = restTemplate.getForObject(url, String.class);
            System.out.println("Ping response: " + response);
        } catch (Exception e) {
            System.err.println("Failed to ping: " + e.getMessage());
        }
    }
}
