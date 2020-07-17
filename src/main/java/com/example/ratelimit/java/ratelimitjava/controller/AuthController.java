package com.example.ratelimit.java.ratelimitjava.controller;

import com.example.ratelimit.java.ratelimitjava.domain.dto.PasswordRequest;
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

    @PostMapping("/reset-password")
    public void resetPassword(@RequestBody PasswordRequest passwordRequest) throws IllegalAccessException {
        authService.resetPassword(passwordRequest.getOldPassword(), passwordRequest.getNewPassword());
    }

}
