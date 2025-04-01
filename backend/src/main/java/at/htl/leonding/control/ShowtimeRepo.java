package at.htl.leonding.control;

import at.htl.leonding.entity.Showtime;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class ShowtimeRepo implements PanacheRepository<Showtime> {

    public List<Showtime> getShowtimeByDate(LocalDate date) {
        return list("showDateTime = ?1", date).stream().toList();
    }
}
