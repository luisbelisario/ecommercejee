package org.belisario.repository;

import org.belisario.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryBucket {

    private final List<Category> categoryList;

    public CategoryBucket() {
        this.categoryList = new ArrayList<>();
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void addCategory(Category category) {
        if (category != null) {
            categoryList.add(category);
        }
    }
}
