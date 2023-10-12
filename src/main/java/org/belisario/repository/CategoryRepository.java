package org.belisario.repository;

import org.belisario.model.Category;

import java.util.List;

public interface CategoryRepository {

    Category save(Category category);

    List<Category> find();

    Category findById(Long id);
}
