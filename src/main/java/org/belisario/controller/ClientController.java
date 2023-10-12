package org.belisario.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.belisario.model.Client;

@Path("/client")
public class ClientController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Client getClient() {
        return new Client(1L,
                "client@gmail.com",
                "1234",
                "Client",
                "1234567");
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public String createClient(Client client) {
        return client.toString();
    }
}
