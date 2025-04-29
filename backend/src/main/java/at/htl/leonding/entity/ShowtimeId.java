package at.htl.leonding.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ShowtimeId implements Serializable {

    private long movieId;
    private long roomId;

    public ShowtimeId(long movieId, long roomId) {
        this.movieId = movieId;
        this.roomId = roomId;
    }

    public ShowtimeId() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShowtimeId that = (ShowtimeId) o;
        return movieId == that.movieId && roomId == that.roomId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, roomId);
    }
}
