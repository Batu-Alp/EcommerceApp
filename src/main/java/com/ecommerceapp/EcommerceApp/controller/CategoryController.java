package com.ecommerceapp.EcommerceApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<String> getCategories() {
        return new ResponseEntity<>("Product", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCategory(@RequestBody Category category) {

        categoryService.createCategory(category);
        return new ResponseEntity<>("Category updated successfully", HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> findCategories() {
        List<Category> body = categoryService.findCategories();
        return new ResponseEntity<>(body, HttpStatus.OK);

    }

    @PostMapping("/update/{categoryId}")
    public ResponseEntity<String> updateCategory(@PathVariable("categoryId") int categoryId,
            @RequestBody Category category) {

        categoryService.updateCategory(categoryId, category);
        return new ResponseEntity<>("Category updated successfully", HttpStatus.OK);

        // return "Product Updated";

    }

}
