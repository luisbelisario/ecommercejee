package org.belisario.service;

import jakarta.inject.Inject;
import org.belisario.config.Repository;
import org.belisario.config.Service;
import org.belisario.model.Category;
import org.belisario.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Inject
    @Repository
    CategoryRepository repository;

    @Override
    public Category create(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return repository.find();
    }

    @Override
    public Category findById(Long id) {
        return repository.findById(id);
    }
}
