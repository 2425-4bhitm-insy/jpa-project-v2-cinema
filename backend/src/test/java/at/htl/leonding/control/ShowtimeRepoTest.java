package at.htl.leonding.control;

import at.htl.leonding.entity.Movie;
import at.htl.leonding.entity.Showtime;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class ShowtimeRepoTest {

    @Inject
    ShowtimeRepo showtimeRepo;

    @Inject
    MovieRepo movieRepo;

    @Test
    void testGetAll() {
        List<Showtime> showtimes = showtimeRepo.getAll();
        assertNotNull(showtimes);
        assertFalse(showtimes.isEmpty());
    }

//    @Test
//    void testGetShowtimeByDate_existingDate() {
//        LocalDateTime date = LocalDateTime.of(2025, 4, 11, 18, 30, 0);
//        List<Showtime> showtimes = showtimeRepo.getShowtimeByDate(date);
//
//        assertNotNull(showtimes);
//        assertFalse(showtimes.isEmpty());
//
//        assertTrue(showtimes.stream().allMatch(s -> s.getShowDateTime().toLocalDate().equals(date)));
//    }

}
