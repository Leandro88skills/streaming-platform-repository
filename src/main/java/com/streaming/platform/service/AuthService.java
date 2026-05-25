package com.streaming.platform.service;

import com.streaming.platform.model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final User demoUser =
            new User("admin@streaming.com", "123456");

    public boolean login(String email, String password) {

        return demoUser.getEmail().equals(email)
                && demoUser.getPassword().equals(password);
    }
}