package com.streaming.platform.builder;

import com.streaming.platform.model.Genre;
import com.streaming.platform.model.Series;

public class SeriesBuilder {

    private Long id;
    private String title;
    private Genre genre;
    private int seasons;

    public SeriesBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public SeriesBuilder title(String title) {
        this.title = title;
        return this;
    }

    public SeriesBuilder genre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public SeriesBuilder seasons(int seasons) {
        this.seasons = seasons;
        return this;
    }

    public Series build() {
        return Series.builder()
                .id(id)
                .title(title)
                .genre(genre)
                .seasons(seasons)
                .build();
    }
}