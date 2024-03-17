package com.ecommerceapp.EcommerceApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerceapp.EcommerceApp.dto.ProductDTO;
import com.ecommerceapp.EcommerceApp.service.CategoryService;
import com.ecommerceapp.EcommerceApp.service.ProductService;
import com.ecommerceapp.EcommerceApp.model.Category;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public ResponseEntity<List<ProductDTO>> getProducts() {
        List<ProductDTO> body = productService.listProducts();
        return new ResponseEntity<List<ProductDTO>>(body, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDto) {
        Optional<Category> optionalCategory = categoryService.findByCategoryId(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return new ResponseEntity<>("category is invalid", HttpStatus.CONFLICT);
        }
        Category category = optionalCategory.get();
        productService.addProduct(productDto, category);
        return new ResponseEntity<>("Product has been added", HttpStatus.CREATED);
    }

    @PostMapping("/update/{productID}")
    public ResponseEntity<String> updateProduct(@PathVariable("productID") Integer productID,
            @RequestBody @Valid ProductDTO productDto) {
        Optional<Category> optionalCategory = categoryService.findByCategoryId(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return new ResponseEntity<>("category is invalid", HttpStatus.CONFLICT);
        }
        Category category = optionalCategory.get();
        productService.updateProduct(productID, productDto, category);
        return new ResponseEntity<>("Product has been updated", HttpStatus.OK);
    }

}
