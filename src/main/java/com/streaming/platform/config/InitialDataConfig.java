package com.streaming.platform.config;

import com.streaming.platform.builder.MovieBuilder;
import com.streaming.platform.builder.SeriesBuilder;
import com.streaming.platform.model.Genre;
import com.streaming.platform.model.User;
import com.streaming.platform.repository.StreamingRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class InitialDataConfig {

    private final StreamingRepository repository;

    @PostConstruct
    public void init() {

        // Usuarios demo
        repository.getUsers().add(
                new User("admin@streaming.com", "123456")
        );

        repository.getUsers().add(
                new User("user@streaming.com", "stream123")
        );

        // Películas
        repository.getMovies().add(
                new MovieBuilder()
                        .id(1L)
                        .title("Faith Warriors")
                        .genre(Genre.ESPIRITUAL)
                        .duration(120)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(2L)
                        .title("Action Force")
                        .genre(Genre.ACCION)
                        .duration(110)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(3L)
                        .title("Funny Days")
                        .genre(Genre.COMEDIA)
                        .duration(95)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(4L)
                        .title("Adventure Quest")
                        .genre(Genre.AVENTURA)
                        .duration(130)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(5L)
                        .title("Fantasy Realm")
                        .genre(Genre.FANTASIA)
                        .duration(140)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(6L)
                        .title("Broken Hearts")
                        .genre(Genre.DRAMA)
                        .duration(118)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(7L)
                        .title("Spiritual Light")
                        .genre(Genre.ESPIRITUAL)
                        .duration(125)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(8L)
                        .title("Battle Zone")
                        .genre(Genre.ACCION)
                        .duration(115)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(9L)
                        .title("Laugh Time")
                        .genre(Genre.COMEDIA)
                        .duration(99)
                        .build()
        );

        repository.getMovies().add(
                new MovieBuilder()
                        .id(10L)
                        .title("Epic Journey")
                        .genre(Genre.AVENTURA)
                        .duration(145)
                        .build()
        );

        // Series
        repository.getSeries().add(
                new SeriesBuilder()
                        .id(1L)
                        .title("Soul Path")
                        .genre(Genre.ESPIRITUAL)
                        .seasons(3)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(2L)
                        .title("War Squad")
                        .genre(Genre.ACCION)
                        .seasons(5)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(3L)
                        .title("Comedy House")
                        .genre(Genre.COMEDIA)
                        .seasons(4)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(4L)
                        .title("Lost Kingdom")
                        .genre(Genre.AVENTURA)
                        .seasons(6)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(5L)
                        .title("Magic World")
                        .genre(Genre.FANTASIA)
                        .seasons(5)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(6L)
                        .title("Life Stories")
                        .genre(Genre.DRAMA)
                        .seasons(4)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(7L)
                        .title("Holy Mission")
                        .genre(Genre.ESPIRITUAL)
                        .seasons(2)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(8L)
                        .title("Elite Force")
                        .genre(Genre.ACCION)
                        .seasons(3)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(9L)
                        .title("Crazy Family")
                        .genre(Genre.COMEDIA)
                        .seasons(5)
                        .build()
        );

        repository.getSeries().add(
                new SeriesBuilder()
                        .id(10L)
                        .title("Dragon Empire")
                        .genre(Genre.FANTASIA)
                        .seasons(7)
                        .build()
        );
    }
}