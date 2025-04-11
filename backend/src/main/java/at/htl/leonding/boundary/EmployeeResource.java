package at.htl.leonding.boundary;

import at.htl.leonding.control.EmployeeRepo;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    EmployeeRepo employeeRepo;

    @GET
    public Response getAllEmployees() {
        employeeRepo.getAll();
        return Response.ok(employeeRepo.getAll()).build();
    }

    @GET
    @Path("/sold-more-than-two-tickets")
    public Response getEmployeesSoldMoreThanTwoTickets() {
        return Response.ok(employeeRepo.findSoldMoreThanTwoTickets()).build();
    }

}
