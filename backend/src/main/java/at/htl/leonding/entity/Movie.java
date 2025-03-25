package at.htl.leonding.entity;

import at.htl.leonding.entity.enumerations.Genre;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titel;

    @Enumerated(EnumType.STRING)
    @Column
    private Genre genre;

    @Column
    private int duration;

    @Column
    private int ageRating;

    @Column
    private String description;

    @Column
    LocalDate releaseDate;

    public Movie(String titel, Genre genre, int duration, int ageRating, String description, LocalDate releaseDate) {
        this.titel = titel;
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

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
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
