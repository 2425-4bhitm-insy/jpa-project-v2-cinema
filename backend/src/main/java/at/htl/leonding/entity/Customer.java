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
        ),
        @NamedQuery(
                name = "Customer.getMostWealthiestCustomers",
                query = """
                    select new at.htl.leonding.entity.dto.CustomerTicketDto(c.name, SUM(t.price)) from Ticket t
                    join t.customer c
                    group by 1 order by 2 desc
                    limit 5
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
