package at.htl.leonding.entity;
import jakarta.persistence.*;

@Entity
public class Ticket {

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    Showtime showtime;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    Employee employee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double price;

    @Column
    private int seatNumber;

    public Ticket(double price, int seatNumber, Showtime showtime, Customer customer) {
        this.price = price;
        this.seatNumber = seatNumber;
        this.showtime = showtime;
        this.customer = customer;
    }

    public Ticket() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}