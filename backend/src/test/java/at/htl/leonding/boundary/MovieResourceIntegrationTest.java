package at.htl.leonding.boundary;

import at.htl.leonding.entity.Movie;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

import jakarta.ws.rs.*;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@QuarkusTest
public class MovieResourceIntegrationTest {

    @Test
    void testGetAllMovies() {
        given()
                .when().get("/movies")
                .then()
                .statusCode(200)
                .body("$", not(empty()));
    }

    @Test
    void testGetMovieById() {
        // Assuming a movie with ID 1 exists
        given()
                .when().get("/movies/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }

    @Test
    void testGetMoviesByAge() {
        given()
                .when().get("/movies/by-age/12")
                .then()
                .statusCode(200)
                .body("$", not(empty()))
                .body("ageRating", everyItem(lessThanOrEqualTo(12)));
    }

    @Test
    void testGetMoviesSortedByRating() {
        given()
                .when().get("/movies/sorted-by-rating")
                .then()
                .statusCode(200)
                .body("$", not(empty()));
    }

    @Test
    void testGetShortestMovieByGenre() {
        given()
                .when().get("/movies/shortest-movie-by-genre/ANIMATION")
                .then()
                .statusCode(200)
                .body("$", not(empty()))
                .body("genre.name", everyItem(equalTo("ANIMATION")));
    }

    @Test
    void testCreateMovie() {
        Movie newMovie = new Movie("Test Movie", null, 120, 12, "Test Description", null);

        given()
                .contentType("application/json")
                .body(newMovie)
                .when().post("/movies")
                .then()
                .statusCode(Response.Status.CREATED.getStatusCode())
                .body("title", equalTo("Test Movie"));
    }

    @Test
    void testUpdateMovie() {
        Movie updatedMovie = new Movie("Updated Movie", null, 130, 15, "Updated Description", null);

        given()
                .contentType("application/json")
                .body(updatedMovie)
                .when().put("/movies/1")
                .then()
                .statusCode(200)
                .body("title", equalTo("Updated Movie"));
    }

    @Test
    void testDeleteMovie() {
        given()
                .when().delete("/movies/2")
                .then()
                .statusCode(200);
    }
}