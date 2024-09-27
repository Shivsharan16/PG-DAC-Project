package com.AyurHealth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AyurHealth.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    public User findByEmail(String e);
}
