package org.belisario.repository;

import org.belisario.config.Repository;
import org.belisario.model.Category;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryBucket categoryBucket = new CategoryBucket();


    @Override
    public Category save(Category category) {
        categoryBucket.addCategory(category);
        return category;
    }

    @Override
    public List<Category> find() {
        return categoryBucket.getCategoryList();
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> optionalCategory = categoryBucket
                .getCategoryList()
                .stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst();
        if (optionalCategory.isPresent()) {
            return optionalCategory.get();
        } else {
            throw new RuntimeException("Category not found");
        }
    }
}
