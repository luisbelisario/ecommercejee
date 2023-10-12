package org.belisario.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.belisario.config.Service;
import org.belisario.model.Category;
import org.belisario.service.CategoryService;

import java.util.List;

@Path("/category")
public class CategoryController {

    @Inject
    @Service
    CategoryService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> getCategories() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Category getCategory(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Category createCategory(Category category) {
        return service.create(category);
    }
}
