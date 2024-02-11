package com.ecommerceapp.EcommerceApp.dto;

import com.ecommerceapp.EcommerceApp.model.Product;
import com.ecommerceapp.EcommerceApp.model.ShoppingCart;

import jakarta.validation.constraints.NotNull;

public class ShoppingCartItemDTO {

    private Integer id;
    private @NotNull Integer quantity;
    private @NotNull Product product;

    public ShoppingCartItemDTO() {
    }

    public ShoppingCartItemDTO(ShoppingCart cart) {
        this.setId(cart.getId());
        this.setQuantity(cart.getQuantity());
        this.setProduct(cart.getProduct());
    }

    @Override
    public String toString() {
        return "ShoppingCartDto{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", productName=" + product.getName() +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
