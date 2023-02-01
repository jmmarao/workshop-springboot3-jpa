package com.educandoweb.workshopspringboot3jpa.services;

import com.educandoweb.workshopspringboot3jpa.entities.User;
import com.educandoweb.workshopspringboot3jpa.repositories.UserRepository;
import com.educandoweb.workshopspringboot3jpa.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserById(Long id) {
        Optional<User> userToFind = userRepository.findById(id);
        return userToFind.orElseThrow(() -> new ResourceNotFoundException(id));
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

    public User updateUser(Long id, User user) {
        User userToUpdate = userRepository.getReferenceById(id);
        updateUserData(userToUpdate, user);
        return userRepository.save(userToUpdate);
    }

    private void updateUserData(User userToUpdate, User user) {
        userToUpdate.setName(user.getName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPhone(userToUpdate.getPhone());
    }
}
