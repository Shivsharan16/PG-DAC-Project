package com.AyurHealth.services;

import org.springframework.stereotype.Service;

import com.AyurHealth.payload.CartDetailDto;
import com.AyurHealth.payload.CartHelp;

@Service
public interface CartDetailsService {

    //add product
    public CartDetailDto addProduct(CartHelp cartHelp);
}
