package com.ecommerceapp.EcommerceApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceapp.EcommerceApp.model.Category;
import com.ecommerceapp.EcommerceApp.model.Product;
import com.ecommerceapp.EcommerceApp.dto.ProductDTO;

import com.ecommerceapp.EcommerceApp.repository.IProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<ProductDTO> listProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDtos = new ArrayList<>();

        for (Product product : products) {
            ProductDTO productDto = getDtoFromProduct(product);
            productDtos.add(productDto);
        }
        return productDtos;
    }

    public static ProductDTO getDtoFromProduct(Product product) {
        ProductDTO productDto = new ProductDTO(product);
        return productDto;
    }

    public static Product getProductFromDto(ProductDTO productDto, Category category) {
        Product product = new Product(productDto, category);
        return product;
    }

    public void addProduct(ProductDTO productDto, Category category) {
        Product product = getProductFromDto(productDto, category);
        productRepository.save(product);
    }

    public void updateProduct(Integer productID, ProductDTO productDto, Category category) {
        Product product = getProductFromDto(productDto, category);
        product.setId(productID);
        productRepository.save(product);
    }

    public Product getProductById(Integer productId) throws Exception {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (!optionalProduct.isPresent())
            throw new Exception("Product id is invalid " + productId);
        return optionalProduct.get();
    }

}
