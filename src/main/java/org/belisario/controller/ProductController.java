package org.belisario.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.belisario.model.Category;
import org.belisario.model.Product;

import java.math.BigDecimal;

@Path("/product")
public class ProductController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProduct() {
        Category category = new Category(1L,
                "Electronics");
        return new Product(1L,
                "792362-121391-181291",
                "iPhone 14",
                category,
                BigDecimal.valueOf(300.00));
    }
}
