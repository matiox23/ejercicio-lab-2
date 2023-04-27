package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.User;

public interface  UserService {

    User createUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);

}
