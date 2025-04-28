package at.htl.leonding.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Customer.getAllCustomerWithGenre",
                query = """
                    select c from Customer c
                    join c.favoriteGenre g
                    where g.name = ?1
                """
        )
})
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
