package at.htl.leonding.boundary;

import at.htl.leonding.control.MovieRepo;
import at.htl.leonding.entity.Movie;
import at.htl.leonding.entity.dto.MovieReviewDto;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @Inject
    MovieRepo movieRepo;

    @GET
    @Path("{id}")
    public Movie getMovieById(@PathParam("id") Long id) {
        return movieRepo.findMovieById(id);
    }

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

    @GET
    @Path("/shortest-movie-by-genre/{genre}")
    public List<Movie> getShortestMovieByGenre(@PathParam("genre") String genre) {
        return movieRepo.getShortestMovieByGenre(genre);
    }

    @POST
    @Transactional
    public Response createMovie(Movie movie) {
        movieRepo.insert(movie);
        return Response.status(Response.Status.CREATED).entity(movie).build();
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Response updateMovie(@PathParam("id") Long id, Movie updatedMovie) {
        Movie movie = movieRepo.findMovieById(id);
        if (movie == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        updatedMovie.setId(id);
        movieRepo.update(updatedMovie);
        return Response.ok(updatedMovie).build();
    }

    @DELETE
    @Transactional
    @Path("/delete/{id}")
    public Response deleteMovie(@PathParam("id") Long id) {
        boolean deleted = movieRepo.deleteMovie(id);
        return Response.ok().build();
    }
}
