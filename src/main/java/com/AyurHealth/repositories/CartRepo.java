package com.AyurHealth.repositories;


import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AyurHealth.entities.Cart;
import com.AyurHealth.entities.User;
import com.AyurHealth.payload.CartDto;


public interface CartRepo extends JpaRepository<Cart,Integer> {
   public Cart findByUser(User user);
//   public Cart findByUser_id(Integer Id);
}
