package com.streaming.platform.builder;

import com.streaming.platform.model.Genre;
import com.streaming.platform.model.Movie;

public class MovieBuilder {

    private Long id;
    private String title;
    private Genre genre;
    private int duration;

    public MovieBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder genre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public MovieBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public Movie build() {
        return Movie.builder()
                .id(id)
                .title(title)
                .genre(genre)
                .duration(duration)
                .build();
    }
}