package com.claudia.portfolio.model;

public record Project(
        String title,
        String category,
        String description,
        String image,
        String poster,
        String link,
        String technology,
        boolean featured
) {}
