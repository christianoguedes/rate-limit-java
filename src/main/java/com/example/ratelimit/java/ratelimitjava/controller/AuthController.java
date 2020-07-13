package com.example.ratelimit.java.ratelimitjava.controller;

import com.example.ratelimit.java.ratelimitjava.domain.dto.AuthRequest;
import com.example.ratelimit.java.ratelimitjava.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public void login(@RequestBody AuthRequest authRequest) throws IllegalAccessException {
        authService.login(authRequest.getUsername(), authRequest.getPassword());
    }
}
