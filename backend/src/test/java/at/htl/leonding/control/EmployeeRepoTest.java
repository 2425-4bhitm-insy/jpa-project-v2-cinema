package at.htl.leonding.control;

import at.htl.leonding.entity.*;
import at.htl.leonding.entity.dto.EmployeeSoldDto;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class EmployeeRepoTest {

    @Inject
    EntityManager em;

    @Inject
    EmployeeRepo employeeRepo;

    Department testDepartment;
    Employee emp1;
    Employee emp2;
    Customer dummyCustomer;
    Showtime dummyShowtime;

    @BeforeEach
    @Transactional
    void setUp() {
        em.createQuery("DELETE FROM Ticket").executeUpdate();
        em.createQuery("DELETE FROM Review").executeUpdate();
        em.createQuery("DELETE FROM Customer").executeUpdate();
        em.createQuery("DELETE FROM Employee").executeUpdate();
        em.createQuery("DELETE FROM Department").executeUpdate();
        em.createQuery("DELETE FROM Showtime").executeUpdate();

        testDepartment = new Department("Sales");
        em.persist(testDepartment);

        emp1 = new Employee("Alice", "alice@example.com", "123456", LocalDate.of(1990, 1, 1), testDepartment, 3000.0, LocalDate.of(2020, 1, 1));
        emp2 = new Employee("Bob", "bob@example.com", "654321", LocalDate.of(1985, 5, 20), testDepartment, 3200.0, LocalDate.of(2019, 5, 20));
        em.persist(emp1);
        em.persist(emp2);

        ShowtimeId showtimeId = new ShowtimeId(1L, 1L);
        dummyShowtime = new Showtime();
        dummyShowtime.setShowtimeId(showtimeId);
        dummyShowtime.setShowDateTime(LocalDateTime.now());
        em.persist(dummyShowtime);

        dummyCustomer = new Customer();
        dummyCustomer.setName("Test Customer");
        em.persist(dummyCustomer);

        Ticket ticket1 = new Ticket(10.0, 1, dummyShowtime, dummyCustomer);
        ticket1.setEmployee(emp1);
        em.persist(ticket1);

        Ticket ticket2 = new Ticket(10.0, 2, dummyShowtime, dummyCustomer);
        ticket2.setEmployee(emp1);
        em.persist(ticket2);

        Ticket ticket3 = new Ticket(10.0, 3, dummyShowtime, dummyCustomer);
        ticket3.setEmployee(emp2);
        em.persist(ticket3);
    }

    @Test
    @Transactional
    void testFindSoldMoreThanTickets() {
        List<EmployeeSoldDto> result = employeeRepo.findSoldMoreThanTickets(0);
        assertEquals(2, result.size());

        EmployeeSoldDto dto1 = result.get(0);
        assertEquals(2, dto1.ticketsSold());
        assertEquals(emp1.getId(), dto1.employeeId());
        assertEquals(emp1.getName(), dto1.employeeName());

        EmployeeSoldDto dto2 = result.get(1);
        assertEquals(1, dto2.ticketsSold());
        assertEquals(emp2.getId(), dto2.employeeId());
        assertEquals(emp2.getName(), dto2.employeeName());
    }
}
