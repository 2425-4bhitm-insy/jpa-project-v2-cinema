package at.htl.leonding.entity;

import jakarta.inject.Inject;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Showtime {

    @Column
    private LocalDateTime showDateTime;

    @EmbeddedId
    @Cascade(CascadeType.ALL)
    private ShowtimeId showtimeId;

    public LocalDateTime getShowDateTime() {
        return showDateTime;
    }

    public void setShowDateTime(LocalDateTime showDateTime) {
        this.showDateTime = showDateTime;
    }

    public ShowtimeId getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(ShowtimeId showtimeId) {
        this.showtimeId = showtimeId;
    }
}
