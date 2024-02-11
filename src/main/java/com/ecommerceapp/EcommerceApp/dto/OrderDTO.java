package com.ecommerceapp.EcommerceApp.dto;

import com.ecommerceapp.EcommerceApp.model.Order;

import jakarta.validation.constraints.NotNull;

public class OrderDTO {
    private Integer id;
    private @NotNull Integer userId;

    public OrderDTO() {
    }

    public OrderDTO(Order order) {
        this.setId(order.getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
