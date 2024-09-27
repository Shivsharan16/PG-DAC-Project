package com.AyurHealth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyurHealth.entities.Cart;
import com.AyurHealth.entities.CartDetalis;
import com.AyurHealth.entities.Product;

public interface CartDetailsRepo extends JpaRepository<CartDetalis,Integer> {
    public void deleteByProductsAndCart(Product product, Cart cart);
    public CartDetalis findByProductsAndCart(Product product, Cart cart);
}
