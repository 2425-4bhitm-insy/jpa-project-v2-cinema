package at.htl.leonding.entity;

import at.htl.leonding.entity.enumerations.Genre;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Customer extends Person {

    public Customer() {
    }

    public Customer(String name, String email, String phoneNumber, LocalDate birthDate, Genre favoriteGenre) {
        super(name, email, phoneNumber, birthDate);
    }

}
