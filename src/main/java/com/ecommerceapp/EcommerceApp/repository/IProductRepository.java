package com.ecommerceapp.EcommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceapp.EcommerceApp.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

}
