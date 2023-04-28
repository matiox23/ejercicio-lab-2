package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.Book;
import com.example.labpropuesto2.models.User;

import java.util.List;

public interface  UserService {


    User createUser(User user);
    User getUserById(Long id);
    User getUserByUsername(String username);

    User updateUser(Long id, User userDetails);

    List<User> getAllUser();

    void deleUser(Long id);

    User register(String username, String password, String email);

    User login(String username, String password);
}
