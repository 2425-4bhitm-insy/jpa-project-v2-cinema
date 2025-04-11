package at.htl.leonding.control;
import at.htl.leonding.entity.Employee;
import at.htl.leonding.entity.dto.EmployeeSoldDto;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

@ApplicationScoped
public class EmployeeRepo implements PanacheRepository<Employee> {

    public List<Employee> getAll() {
        return listAll().stream().toList();
    }

    public List<EmployeeSoldDto> findSoldMoreThanTwoTickets() {
         String query = "SELECT new at.htl.leonding.entity.dto.EmployeeSoldDto(COUNT(t.employee.id), t.employee.id, t.employee.name) " +
                "FROM Ticket t " +
                "JOIN t.employee e " +
                "GROUP BY t.employee.id, t.employee.name " +
                "HAVING COUNT(t.employee.id) > 2";

        return getEntityManager().createQuery(query, EmployeeSoldDto.class).getResultList();
    }

}
