package org.belisario.service;

import org.belisario.model.Category;

import java.util.List;

public interface CategoryService {

    Category create(Category category);

    List<Category> findAll();

    Category findById(Long id);
}
