package org.belisario.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.belisario.model.Category;

@Path("/category")
public class CategoryController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Category getCategory() {
        return new Category(1L,
                "Electronics");
    }
}
