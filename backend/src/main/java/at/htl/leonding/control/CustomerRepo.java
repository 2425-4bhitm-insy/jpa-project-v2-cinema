package at.htl.leonding.control;

import at.htl.leonding.entity.Customer;
import at.htl.leonding.entity.dto.CustomerTicketDto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CustomerRepo implements PanacheRepository<Customer> {

    public List<Customer> getAll() {
        return listAll().stream().toList();
    }

    public List<Customer> getAllCustomerWithGenre(String genreName) {
        return getEntityManager()
                .createNamedQuery("Customer.getAllCustomerWithGenre", Customer.class)
                .setParameter(1, genreName)
                .getResultList();
    }

    public List<CustomerTicketDto> getMostWealthiestCustomers() {
        return getEntityManager()
                .createNamedQuery("Customer.getMostWealthiestCustomers", CustomerTicketDto.class)
                .getResultList();
    }
}
