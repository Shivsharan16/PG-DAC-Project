package com.AyurHealth.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.AyurHealth.config.JwtService;
import com.AyurHealth.entities.Cart;
import com.AyurHealth.entities.Role;
import com.AyurHealth.entities.TotalRoles;
import com.AyurHealth.entities.User;
import com.AyurHealth.payload.SingIn;
import com.AyurHealth.payload.UserDto;
import com.AyurHealth.repositories.UserRepo;
import com.AyurHealth.services.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @Override
    public UserDto CreateUser(UserDto userDto) {
        User user= this.modelMapper.map(userDto, User.class);
        List<Role> list= new ArrayList<>();
                list.add(new Role(TotalRoles.ADMIN.name()));
        user.setRole(list);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Cart cart= new Cart();
        cart.setUser(user);
        user.setCart(cart);

        this.userRepo.save(user);
        return this.modelMapper.map(user,UserDto.class);
    }

    @Override
    public SingIn SingIn(SingIn singIn) {
    	try {
        this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(singIn.getEmail(),singIn.getPassword()));
        User user=this.userRepo.findByEmail(singIn.getEmail());
        var jwtToken=jwtService.generateToken(user);
        singIn.setJwt(jwtToken);
        }catch(Exception e) {
        	e.printStackTrace();
        }
    	return singIn;
    }
}
