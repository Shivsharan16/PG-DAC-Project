package com.AyurHealth.services;

import com.AyurHealth.payload.SingIn;
import com.AyurHealth.payload.UserDto;

public interface UserService {


    UserDto CreateUser(UserDto userDto);

    SingIn SingIn(SingIn singIn);
}
