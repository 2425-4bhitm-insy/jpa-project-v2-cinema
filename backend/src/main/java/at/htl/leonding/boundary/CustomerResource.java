package at.htl.leonding.boundary;

import at.htl.leonding.control.CustomerRepo;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.hibernate.engine.spi.Resolution;

import java.awt.*;

@Path("customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerRepo customerRepo;

    @GET
    public Response getAllCustomer() {
        return Response.ok(customerRepo.getAll()).build();
    }

    @GET
    @Path("/byGenre/{genre}")
    public Response getAllCustomerWithGenre(@PathParam("genre") String genre) {
        return Response.ok(customerRepo.getAllCustomerWithGenre(genre)).build();
    }

    @GET
    @Path("/mostWealthiest")
    public Response getMostWealthiestCustomers() {
        return Response.ok(customerRepo.getMostWealthiestCustomers()).build();
    }
}
