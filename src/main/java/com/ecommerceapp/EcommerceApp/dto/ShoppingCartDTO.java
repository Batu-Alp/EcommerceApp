package com.ecommerceapp.EcommerceApp.dto;

import java.util.List;

public class ShoppingCartDTO {

    private List<ShoppingCartItemDTO> shoppingCartItems;
    private double totalCost;

    public ShoppingCartDTO(List<ShoppingCartItemDTO> shoppingCartItemDtoList, double totalCost) {
        this.shoppingCartItems = shoppingCartItemDtoList;
        this.totalCost = totalCost;
    }

    public List<ShoppingCartItemDTO> getShoppingCartItems() {
        return shoppingCartItems;
    }

    public void setShoppingCartItems(List<ShoppingCartItemDTO> cartItemDtoList) {
        this.shoppingCartItems = cartItemDtoList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

}
