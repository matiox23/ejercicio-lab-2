package com.example.labpropuesto2.services;

import com.example.labpropuesto2.models.User;
import com.example.labpropuesto2.repositories.BookRepository;
import com.example.labpropuesto2.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository= userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new  EntityNotFoundException("User not found with id " + id));

    }


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public User updateUser(Long id, User userDetails) {
        User user = getUserById(id);
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setEmail(userDetails.getEmail());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public void deleUser(Long id) {
        userRepository.delete(getUserById(id));

    }

    @Override
    public User register(String username, String password, String email) {
        return null;
    }

    @Override
    public User login(String username, String password) {
        return null;
    }


    @Override
    public User getUserByUsername(String username) {
         return userRepository.findByUsername(username).orElseThrow(() -> new
                EntityNotFoundException("User not found with username " + username));
    }


}
