package at.htl.leonding.control;

import at.htl.leonding.entity.Employee;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EmployeeRepo implements PanacheRepository<Employee> {

    public List<Employee> getAll() {
        return listAll().stream().toList();
    }

    public List<Employee> findSoldMoreThanTwoTickets() {
        return getEntityManager().createNamedQuery("Employee.findSoldMoreThanTwoTickets", Employee.class).getResultList();
    }

}
