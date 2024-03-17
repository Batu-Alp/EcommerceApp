package com.ecommerceapp.EcommerceApp.model;

import java.util.List;

import com.ecommerceapp.EcommerceApp.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private @NotNull String name;
    private @NotNull String description;
    private @NotNull String image;
    private @NotNull double price;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    Category category;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Wishlist> wishlist;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<ShoppingCart> shoppingCart;

    public Product(ProductDTO productDto, Category category) {
        this.name = productDto.getName();
        this.image = productDto.getImage();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.category = category;
    }

    public Product(@NotNull String name, @NotNull String description, @NotNull String image,
            @NotNull double price, Category category) {
        super();
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", price="
                + price + "]";
    }

}