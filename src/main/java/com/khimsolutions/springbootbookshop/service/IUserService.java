package com.khimsolutions.springbootbookshop.service;

import com.khimsolutions.springbootbookshop.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
