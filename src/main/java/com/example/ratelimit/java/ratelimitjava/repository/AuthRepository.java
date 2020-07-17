package com.example.ratelimit.java.ratelimitjava.repository;

import com.example.ratelimit.java.ratelimitjava.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class AuthRepository {
    private Map<String, String> fakeUserDB = new HashMap<>();

    public AuthRepository() {
        //fake repository
        fakeUserDB.put("fake-admin", "admin123");
        fakeUserDB.put("foo", "bar");
    }

    public Optional<User> findByUsername(String username) {
        String password = fakeUserDB.get(username);
        if (password == null) {
            return Optional.empty();
        }
        return Optional.of(new User(username, password));
    }

    public void saveNewPassword(User user, String newPassword) {
        fakeUserDB.put(user.getUsername(), newPassword);
    }
}
