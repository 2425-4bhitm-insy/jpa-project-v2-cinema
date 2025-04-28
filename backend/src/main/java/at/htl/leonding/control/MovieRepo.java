package at.htl.leonding.control;

import at.htl.leonding.entity.Movie;
import at.htl.leonding.entity.dto.MovieReviewDto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class MovieRepo implements PanacheRepository<Movie> {

    public void insert(Movie movie) {
        persist(movie);
    }

    public void update(Movie movie) {
        getEntityManager().merge(movie);
    }

    public boolean deleteMovie(Long id) {
        return deleteById(id);
    }

    public Movie findMovieById(Long id) {
        return findById(id);
    }

    public List<Movie> getAll() {
        return listAll().stream().toList();
    }

    public List<Movie> getALlByAgeRating(int age) {
        return list("ageRating <= ?1", age ).stream().toList();
    }

    public List<MovieReviewDto> getAllMoviesSortedByRating() {
        String query = "SELECT new at.htl.leonding.entity.dto.MovieReviewDto(m.title, avg(r.rating)) " +
                "FROM Review r JOIN r.movie m " +
                "GROUP BY m.title " +
                "ORDER BY avg(r.rating) DESC";
        return getEntityManager().createQuery(query, MovieReviewDto.class).getResultList();
    }

    public List<Movie> getAllMoviesByGenre(String genre) {
        return list("genre.name = ?1", genre).stream().toList();
    }

    public List<Movie> getShortestMovieByGenre(String genre) {
        return getEntityManager()
                .createNamedQuery("Movie.findShortestMovieByGenre", Movie.class)
                .setParameter(1, genre)
                .getResultList();
    }
}
