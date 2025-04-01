package at.htl.leonding.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Customer extends Person {


    @Column
    private int loyaltyPoints;

    @ManyToOne
    @JoinColumn(name = "favorite_genre")
    private Genre favoriteGenre;


    public Customer() {
    }

    public Customer(String name, String email, String phoneNumber, LocalDate birthDate) {
        super(name, email, phoneNumber, birthDate);
    }



}
