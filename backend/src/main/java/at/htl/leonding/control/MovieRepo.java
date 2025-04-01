package at.htl.leonding.control;

import at.htl.leonding.entity.Movie;
import at.htl.leonding.entity.dto.MovieReviewDto;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class MovieRepo implements PanacheRepository<Movie> {

    public List<Movie> getAll() {
        return listAll().stream().toList();
    }

    public List<Movie> getALlByAgeRating(int age) {
        return list("ageRating <= ?1", age ).stream().toList();
    }

    public List<MovieReviewDto> getAllMoviesSortedByRating() {
        PanacheQuery<MovieReviewDto> query = find("SELECT m.title, r.rating " +
                "FROM Movie m JOIN m.reviews r ORDER BY r.rating DESC").project(MovieReviewDto.class);
        return query.stream().toList();
    }
}
