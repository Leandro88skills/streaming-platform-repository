package com.streaming.platform.service;

import com.streaming.platform.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CatalogService {

    private final StreamingRepository repository;

    public Map<String, Object> getCatalog() {
        Map<String, Object> response = new HashMap<>();
        response.put("movies", repository.getMovies());
        response.put("series", repository.getSeries());
        return response;
    }
}