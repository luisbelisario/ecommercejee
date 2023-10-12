package org.belisario.service;

import org.belisario.model.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    List<Product> findAll();

    Product findById(Long id);
}
