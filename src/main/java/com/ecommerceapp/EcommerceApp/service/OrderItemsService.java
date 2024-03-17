package com.ecommerceapp.EcommerceApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceapp.EcommerceApp.model.OrderItem;
import com.ecommerceapp.EcommerceApp.repository.IOrderItemsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderItemsService {

    @Autowired
    private IOrderItemsRepository orderItemsRepository;

    public void addOrderedProducts(OrderItem orderItem) {
        orderItemsRepository.save(orderItem);
    }

}
