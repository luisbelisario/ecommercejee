package org.belisario.service;

import jakarta.inject.Inject;
import org.belisario.config.Repository;
import org.belisario.model.Product;
import org.belisario.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Inject
    @Repository
    ProductRepository repository;

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.find();
    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
