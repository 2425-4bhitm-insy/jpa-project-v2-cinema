package at.htl.leonding.entity;

import jakarta.inject.Inject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Showtime {

    @Id
    private Long id;

    @Column
    private LocalDateTime showDateTime;

    @ManyToOne
    Movie movie;

    @ManyToOne
    ScreeningRoom room;

    public ScreeningRoom getRoom() {
        return room;
    }

    public void setRoom(ScreeningRoom room) {
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
