package com.ecommerceapp.EcommerceApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

}
