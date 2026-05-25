package com.streaming.platform.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Series {
    private Long id;
    private String title;
    private Genre genre;
    private int seasons;
}