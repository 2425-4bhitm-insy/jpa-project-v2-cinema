package at.htl.leonding.boundary;

import at.htl.leonding.control.MovieRepo;
import at.htl.leonding.entity.Movie;
import at.htl.leonding.entity.dto.MovieReviewDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @Inject
    MovieRepo movieRepo;

    @GET
    public List<Movie> getAllMovies() {
        return movieRepo.getAll();
    }

    @GET
    @Path("/by-age/{age}")
    public List<Movie> getMoviesByAge(@PathParam("age") int age) {
        return movieRepo.getALlByAgeRating(age);
    }

    @GET
    @Path("/sorted-by-rating")
    public List<MovieReviewDto> getMoviesSortedByRating() {
        return movieRepo.getAllMoviesSortedByRating();
    }
}
