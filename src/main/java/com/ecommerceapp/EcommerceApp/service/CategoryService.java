package com.ecommerceapp.EcommerceApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerceapp.EcommerceApp.repository.ICategoryRepository;
import com.ecommerceapp.EcommerceApp.model.Category;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {
    private ICategoryRepository categoryRepository;

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> findCategories() {
        return categoryRepository.findAll();
    }

    public void updateCategory(int categoryId, Category updatedCategory) {
        Category category = categoryRepository.findById(categoryId).get();
        category.setCategoryName(updatedCategory.getCategoryName());
        category.setDescription(updatedCategory.getDescription());
        // category.setProducts(updatedCategory.getProducts());
        category.setImageUrl(updatedCategory.getImageUrl());
        categoryRepository.save(category);

    }

}
