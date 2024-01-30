package com.ecommerceapp.EcommerceApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceapp.EcommerceApp.model.Category;
import com.ecommerceapp.EcommerceApp.service.CategoryService;

@RestController
@RequestMapping("/category")

public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String getCategories() {
        return "Product";
    }

    @PostMapping("/create")
    public String createCategory(@RequestBody Category category) {

        categoryService.createCategory(category);
        return "Category Created";
    }

    @GetMapping("/categories")
    public List<Category> findCategories() {
        return categoryService.findCategories();
    }

}
