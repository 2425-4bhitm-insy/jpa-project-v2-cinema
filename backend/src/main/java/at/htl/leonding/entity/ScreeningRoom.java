package at.htl.leonding.entity;

import jakarta.persistence.*;

@Entity
public class ScreeningRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int roomNumber;

    @Column
    private int seats;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
