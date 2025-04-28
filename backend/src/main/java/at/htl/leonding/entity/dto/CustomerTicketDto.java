package at.htl.leonding.entity.dto;


public record CustomerTicketDto(
        String name,
        Double sum
) {
    public String getName() {
        return name;
    }

    public double getSum() {
        return sum; // Getter for the sum field
    }
}
