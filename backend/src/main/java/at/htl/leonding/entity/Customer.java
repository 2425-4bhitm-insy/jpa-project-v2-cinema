package at.htl.leonding.entity;

import at.htl.leonding.entity.enumerations.Genre;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Customer extends Person {

    @Enumerated(EnumType.STRING)
    @Column
    private Genre favoriteGenre;


    public Customer() {
    }

    public Customer(String name, String email, String phoneNumber, LocalDate birthDate, Genre favoriteGenre) {
        super(name, email, phoneNumber, birthDate);
        this.favoriteGenre = favoriteGenre;
    }

    public Genre getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(Genre favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }
}
