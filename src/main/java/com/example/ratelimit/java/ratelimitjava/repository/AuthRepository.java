package com.example.ratelimit.java.ratelimitjava.repository;

import com.example.ratelimit.java.ratelimitjava.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AuthRepository {

    public Optional<User> findByUsername(String username) {
        //fake repository
        switch (username) {
            case "admin": return Optional.of(new User(username, "admin123"));
            case "foo": return Optional.of(new User(username, "bar"));
            default: return Optional.empty();
        }
    }
}
