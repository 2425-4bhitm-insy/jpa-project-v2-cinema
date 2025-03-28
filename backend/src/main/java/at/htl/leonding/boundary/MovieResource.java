package at.htl.leonding.boundary;

import at.htl.leonding.control.MovieRepo;
import at.htl.leonding.entity.Movie;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
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
}
