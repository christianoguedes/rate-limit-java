package com.example.ratelimit.java.ratelimitjava.service;

import com.example.ratelimit.java.ratelimitjava.domain.User;
import com.example.ratelimit.java.ratelimitjava.repository.AuthRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public void login(String username, String password) throws IllegalAccessException {
        User user = authRepository.findByUsername(username).orElseThrow(IllegalAccessException::new);
        if (!user.getPassword().equals(password)) {
            throw new IllegalAccessException();
        }
    }

    public String loginKey(String ip) {
        return ip + "-example-service-request-key";
    }

}
