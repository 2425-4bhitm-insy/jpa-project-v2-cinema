package at.htl.leonding.control;

import at.htl.leonding.entity.Movie;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class MovieRepoTest {

    @Inject
    MovieRepo movieRepo;

    @Test
    void testFindMovieById_existing() {
        Movie movie = movieRepo.find("title", "Titanic").firstResult();
        assertNotNull(movie);

        Movie found = movieRepo.findMovieById(movie.getId());
        assertNotNull(found);
        assertEquals("Titanic", found.getTitle());
    }

    @Test
    void testGetAll() {
        List<Movie> movies = movieRepo.getAll();
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
    }

    @Test
    void testGetAllByAgeRating() {
        List<Movie> movies = movieRepo.getALlByAgeRating(12);
        assertNotNull(movies);
        assertTrue(movies.stream().allMatch(m -> m.getAgeRating() <= 12));
    }

    @Test
    void testGetShortestMovieByGenre_existingData() {

        // When
        List<Movie> shortestMovie = movieRepo.getShortestMovieByGenre("ANIMATION");

        // Then
        assertNotNull(shortestMovie);
        assertFalse(shortestMovie.isEmpty());

        Movie shortest = shortestMovie.getFirst();
        assertEquals("ANIMATION", shortest.getGenre().getName());

        // Optional: Falls du den konkreten Film erwartest (z. B. "Movie Two" mit 90 Minuten)
        // kannst du das überprüfen, falls du deine Testdaten gut kennst:
        assertEquals(88, shortest.getDuration());
    }

}