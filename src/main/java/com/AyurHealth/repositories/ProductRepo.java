package com.AyurHealth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyurHealth.entities.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
