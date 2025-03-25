package at.htl.leonding.entity;

import at.htl.leonding.entity.enumerations.Genre;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Customer extends Person {

    @Column
    private Genre favoriteGenre;


    public Customer() {
    }

    public Customer(String name, String address, String email, String phoneNumber, int age, Genre favoriteGenre) {
        super(name, email, phoneNumber, age);
        this.favoriteGenre = favoriteGenre;
    }

    public Genre getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(Genre favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }
}
