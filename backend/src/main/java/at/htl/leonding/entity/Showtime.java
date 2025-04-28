package at.htl.leonding.entity;

import jakarta.inject.Inject;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Showtime {

//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Column
    private LocalDateTime showDateTime;

//    @ManyToOne
//    @JoinColumn(name = "movie_id")
//    private Movie movie;
//
//    @ManyToOne
//    @JoinColumn(name = "room_id")
//    private ScreeningRoom room;

    @EmbeddedId
    private ShowtimeId showtimeId;


}
