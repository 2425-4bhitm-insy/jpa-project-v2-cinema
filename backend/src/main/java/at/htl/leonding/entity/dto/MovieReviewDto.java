package at.htl.leonding.entity.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MovieReviewDto {
    String movieTitle;
    int rating;

    public MovieReviewDto(String movieTitle, int rating) {
        this.movieTitle = movieTitle;
        this.rating = rating;
    }
}
