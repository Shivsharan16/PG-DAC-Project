package com.AyurHealth.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.AyurHealth.entities.Cart;
import com.AyurHealth.entities.User;
import com.AyurHealth.payload.ApiResponse;
import com.AyurHealth.payload.CartDto;
import com.AyurHealth.payload.CartHelp;
import com.AyurHealth.payload.UserDto;
import com.AyurHealth.repositories.CartRepo;
import com.AyurHealth.repositories.UserRepo;
import com.AyurHealth.services.CartService;

import java.security.Principal;
import java.util.Optional;

import static org.apache.coyote.http11.Constants.a;

@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CartRepo cartRepo;
    
    @Autowired
    private UserRepo userRepo;
    
    @PostMapping("/addproduct")
    public ResponseEntity<CartDto> addProduct(@RequestBody CartHelp cartHelp,Principal principal){
        String userEmail = principal.getName();
        cartHelp.setUserEmail(userEmail);
        CartDto cartDto = this.cartService.addProductToCart(cartHelp);
        return new ResponseEntity<>(cartDto, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/{userid}")
    public ResponseEntity<Cart> GetCart(@PathVariable int userid){
        Optional<User> user = userRepo.findById(userid);
        Cart cart = cartRepo.findByUser(user.get());
        return new ResponseEntity<>(cart, HttpStatusCode.valueOf(200));
    }


    @DeleteMapping("/product/{productid}")
    public ResponseEntity<ApiResponse> DeleteItem(Principal principal, @PathVariable Integer productid){
        String userEmail = principal.getName();
        this.cartService.RemoveById(productid,userEmail);

        return new ResponseEntity<>(new ApiResponse("remove"),HttpStatusCode.valueOf(200));
    }
}
