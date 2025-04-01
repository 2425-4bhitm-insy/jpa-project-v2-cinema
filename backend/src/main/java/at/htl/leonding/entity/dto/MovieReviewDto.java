package at.htl.leonding.entity.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MovieReviewDto {
    String movieTitle;
    Double rating;

    public MovieReviewDto(String movieTitle, Double rating) {
        this.movieTitle = movieTitle;
        this.rating = rating;
    }
}
