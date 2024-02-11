package com.ecommerceapp.EcommerceApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceapp.EcommerceApp.model.Wishlist;

@Repository
public interface IWishlistRepository extends JpaRepository<Wishlist, Integer> {

    List<Wishlist> findAllByUserIdOrderByCreatedDateDesc(Integer userId);

}
