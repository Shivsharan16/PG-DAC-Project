package com.AyurHealth.services;

import com.AyurHealth.entities.Cart;
import com.AyurHealth.payload.CartDto;
import com.AyurHealth.payload.CartHelp;
import com.AyurHealth.payload.UserDto;

public interface CartService {

    //Create
    CartDto CreateCart(CartHelp cartHelp);

    //add Product To Cart
    CartDto addProductToCart(CartHelp cartHelp);

    //Get
    CartDto GetCart(String userEmail);

    //delete product

    void RemoveById(Integer ProductId,String userEmail);

    //delete


}
