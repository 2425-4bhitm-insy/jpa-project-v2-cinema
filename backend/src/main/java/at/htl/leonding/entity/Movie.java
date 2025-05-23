package at.htl.leonding.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Movie.findShortestMovieByGenre",
                query = """
                    SELECT m
                    FROM Movie m
                    JOIN m.genre g
                    where g.name = ?1 and m.duration = (
                        SELECT min(m2.duration)
                        FROM Movie m2
                        JOIN m2.genre g2
                        where g2.name = ?1
                    )
                """
        )
})
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn
    private Genre genre;

    @Column
    private int duration;

    @Column
    private int ageRating;

    @Column
    private String description;

    @Column
    LocalDate releaseDate;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    public Movie(String title, Genre genre, int duration, int ageRating, String description, LocalDate releaseDate) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.ageRating = ageRating;
        this.description = description;
    }

    public Movie() {

    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        if(ageRating > 18 || ageRating < 0) {
            throw new IllegalArgumentException("Age rating must be between 0 and 18");
        }
        this.ageRating = ageRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
