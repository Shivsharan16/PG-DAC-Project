package com.AyurHealth.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.AyurHealth.payload.CartDetailDto;
import com.AyurHealth.payload.CartHelp;
import com.AyurHealth.repositories.CartDetailsRepo;
import com.AyurHealth.repositories.CartRepo;
import com.AyurHealth.repositories.UserRepo;
import com.AyurHealth.services.CartDetailsService;

public class CartDetailsServiceImpl implements CartDetailsService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CartRepo cartRepo;




    @Override
    public CartDetailDto addProduct(CartHelp cartHelp) {
        int productId=cartHelp.getProductId();
        int quantity= cartHelp.getQuantity();
        String userEmail= cartHelp.getUserEmail();




        //get user





        return null;
    }
}
