package at.htl.leonding.control;

import at.htl.leonding.entity.Movie;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class MovieRepo implements PanacheRepository<Movie> {

    public List<Movie> getALlMovies() {
        return listAll().stream().toList();
    }
}
