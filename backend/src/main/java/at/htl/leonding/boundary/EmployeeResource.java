package at.htl.leonding.boundary;

import at.htl.leonding.control.EmployeeRepo;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
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
    @Path("/sold-more-than-tickets/{tickets}")
    public Response getEmployeesSoldMoreThanTwoTickets(@PathParam("tickets") int tickets) {
        return Response.ok(employeeRepo.findSoldMoreThanTickets(tickets)).build();
    }

}
