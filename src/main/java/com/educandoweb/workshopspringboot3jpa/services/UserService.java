package com.educandoweb.workshopspringboot3jpa.services;

import com.educandoweb.workshopspringboot3jpa.entities.User;
import com.educandoweb.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> findUsers() {
        return userRepository.findAll();
    }

    public User insertUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
