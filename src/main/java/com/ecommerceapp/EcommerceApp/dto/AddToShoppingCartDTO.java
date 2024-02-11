package com.ecommerceapp.EcommerceApp.dto;

import jakarta.validation.constraints.NotNull;

public class AddToShoppingCartDTO {

    private Integer id;
    private @NotNull Integer productId;
    private @NotNull Integer quantity;

    public AddToShoppingCartDTO() {
    }

    @Override
    public String toString() {
        return "ShoppingCartDto{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ",";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
