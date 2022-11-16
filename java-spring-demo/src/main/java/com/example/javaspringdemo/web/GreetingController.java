package com.example.javaspringdemo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.javaspringdemo.service.GreetingService;

@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService greetingService;

    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
