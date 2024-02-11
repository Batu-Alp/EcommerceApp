package com.ecommerceapp.EcommerceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceapp.EcommerceApp.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String categoryName);

}
