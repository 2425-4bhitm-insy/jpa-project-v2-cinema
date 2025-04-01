package at.htl.leonding.boundary;

import at.htl.leonding.entity.Showtime;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import at.htl.leonding.control.ShowtimeRepo;

import java.time.LocalDate;
import java.util.List;


@Path("showtime")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ShowtimeResource {

    @Inject
    ShowtimeRepo showTimeRepo;


    @GET
    @Path("/by-date/{date}")
    public List<Showtime> getShowtimeByDate(@PathParam("date") String date) {
        return showTimeRepo.getShowtimeByDate(LocalDate.parse(date));
    }

}
