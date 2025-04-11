package at.htl.leonding.boundary;

import at.htl.leonding.control.EquipmentRepo;
import at.htl.leonding.entity.Equipment;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/equipment")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EquipmentResource {

    @Inject
    EquipmentRepo equipmentRepo;

    @GET
    public Response getAllEquipment() {
        return Response.ok(equipmentRepo.getAll()).build();
    }

    @GET
    @Path("/{id}")
    public Response getEquipmentById(@PathParam("id") Long id) {
        return Response.ok(equipmentRepo.findEquipmentById(id)).build();
    }

}
