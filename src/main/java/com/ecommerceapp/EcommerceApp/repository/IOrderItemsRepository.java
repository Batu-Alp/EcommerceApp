package com.ecommerceapp.EcommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceapp.EcommerceApp.model.OrderItem;

@Repository
public interface IOrderItemsRepository extends JpaRepository<OrderItem, Integer> {
}
