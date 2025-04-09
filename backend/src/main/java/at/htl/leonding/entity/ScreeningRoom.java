package at.htl.leonding.entity;

import jakarta.persistence.*;

@Entity
public class ScreeningRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String roomNumber;

    @Column
    private int seats;

    public ScreeningRoom(String roomNumber, int seats) {
        this.roomNumber = roomNumber;
        this.seats = seats;
    }

    public ScreeningRoom() {

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
