package at.htl.leonding.entity.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;


public record MovieReviewDto(
        String movieTitle,
        Double rating
) {
//
//
//    public MovieReviewDto(String movieTitle, Double rating) {
//        this.movieTitle = movieTitle;
//        this.rating = rating;
//    }
}
