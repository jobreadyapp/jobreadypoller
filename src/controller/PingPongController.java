package com.example.pingpong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    // This endpoint returns "pong" when "/ping" is requested
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
