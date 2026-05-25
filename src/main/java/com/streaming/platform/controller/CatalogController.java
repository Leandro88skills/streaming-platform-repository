package com.streaming.platform.controller;

import com.streaming.platform.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalog")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService service;

    @GetMapping
    public Object getCatalog() {
        return service.getCatalog();
    }
}