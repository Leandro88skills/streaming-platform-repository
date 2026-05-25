package com.streaming.platform.controller;

import com.streaming.platform.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {

        boolean authenticated =
                service.login(email, password);

        return authenticated
                ? "Acceso autorizado"
                : "Credenciales inválidas";
    }
}