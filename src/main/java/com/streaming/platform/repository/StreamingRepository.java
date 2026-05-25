package com.streaming.platform.repository;

import com.streaming.platform.model.Movie;
import com.streaming.platform.model.Series;
import com.streaming.platform.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StreamingRepository {

    private final List<Movie> movies = new ArrayList<>();
    private final List<Series> series = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Series> getSeries() {
        return series;
    }

    public List<User> getUsers() {
        return users;
    }
}