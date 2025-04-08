package at.htl.leonding.control;

import at.htl.leonding.entity.Showtime;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class ShowtimeRepo implements PanacheRepository<Showtime> {


    public List<Showtime> getAll() {
        return listAll().stream().toList();
    }

    public List<Showtime> getShowtimeByDate(LocalDate date) {
        return list("showDateTime = ?1", date).stream().toList();
    }

    public List<Showtime> getShowtimeByMovieId(Long id) {
        return list("movie.id = ?1", id).stream().toList();
    }


}
