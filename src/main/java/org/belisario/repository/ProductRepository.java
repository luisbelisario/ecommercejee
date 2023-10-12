package org.belisario.repository;

import org.belisario.model.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);

    List<Product> find();

    Product findById(Long id);
}
