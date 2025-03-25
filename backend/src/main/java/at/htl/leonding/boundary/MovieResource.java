package at.htl.leonding.boundary;

import at.htl.leonding.control.MovieRepo;
import at.htl.leonding.entity.Movie;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/api/movies")
public class MovieResource {

    @Inject
    MovieRepo movieRepo;

    @GET
    @Path("/all")
    public List<Movie> getAllMovies() {
        return movieRepo.getALlMovies();
    }
}
