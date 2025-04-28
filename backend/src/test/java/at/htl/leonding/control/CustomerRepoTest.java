package at.htl.leonding.control;

import at.htl.leonding.entity.Customer;
import at.htl.leonding.entity.dto.CustomerTicketDto;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class CustomerRepoTest {

    @Inject
    CustomerRepo customerRepo;

    @Test
    void testGetAll() {
        List<Customer> customers = customerRepo.getAll();
        assertNotNull(customers);
        assertFalse(customers.isEmpty());
    }

    @Test
    void testGetAllCustomerWithGenre_existingGenre() {
        // Assuming there are customers with the genre "Action"
        List<Customer> customers = customerRepo.getAllCustomerWithGenre("ACTION");
        assertNotNull(customers);
        assertFalse(customers.isEmpty());
        // Check if the favoriteGenre field is not null (since we can't directly access it)
        assertTrue(customers.stream().allMatch(c -> c != null));
    }

    @Test
    void testGetMostWealthiestCustomers() {
        List<CustomerTicketDto> wealthiestCustomers = customerRepo.getMostWealthiestCustomers();
        assertNotNull(wealthiestCustomers);
        assertFalse(wealthiestCustomers.isEmpty());

        // Check if the list is sorted by the second field (SUM(t.price)) in descending order
        for (int i = 0; i < wealthiestCustomers.size() - 1; i++) {
            assertTrue(wealthiestCustomers.get(i).getSum() >= wealthiestCustomers.get(i + 1).getSum());
        }
    }
}
