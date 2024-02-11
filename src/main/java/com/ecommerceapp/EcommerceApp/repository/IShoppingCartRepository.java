package com.ecommerceapp.EcommerceApp.repository;

import org.springframework.stereotype.Repository;

import com.ecommerceapp.EcommerceApp.model.ShoppingCart;
import com.ecommerceapp.EcommerceApp.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

    List<ShoppingCart> findAllByUserOrderByCreatedDateDesc(User user);

    List<ShoppingCart> deleteByUser(User user);

}
