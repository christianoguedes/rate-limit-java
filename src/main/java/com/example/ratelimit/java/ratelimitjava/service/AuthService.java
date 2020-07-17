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

    public void resetPassword(String oldPassword, String newPassword) throws IllegalAccessException {
        User user = authRepository.findByUsername(getCurrentAuthUserInSession()).orElseThrow(IllegalAccessException::new);
        if (!user.getPassword().equals(oldPassword)) {
            throw new IllegalAccessException();
        }
        authRepository.saveNewPassword(user, newPassword);
    }

    public String getCurrentAuthUserInSession() {
        return "fake-admin";
    }
}
