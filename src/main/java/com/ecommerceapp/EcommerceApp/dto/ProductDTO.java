package com.ecommerceapp.EcommerceApp.dto;

import com.ecommerceapp.EcommerceApp.model.Product;

import jakarta.validation.constraints.NotNull;

public class ProductDTO {

    private Integer id;
    private @NotNull String name;
    private @NotNull String image;
    private @NotNull double price;
    private @NotNull String description;
    private @NotNull Integer categoryId;

    public ProductDTO(Product product) {
        this.setId(product.getId());
        this.setName(product.getName());
        this.setImage(product.getImage());
        this.setDescription(product.getDescription());
        this.setPrice(product.getPrice());
        this.setCategoryId(product.getCategory().getId());
    }

    public ProductDTO(@NotNull String name, @NotNull String imageURL, @NotNull double price,
            @NotNull String description, @NotNull Integer categoryId) {
        this.name = name;
        this.image = imageURL;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
    }

    public ProductDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

}
