package com.educandoweb.workshopspringboot3jpa.controllers;

import com.educandoweb.workshopspringboot3jpa.entities.User;
import com.educandoweb.workshopspringboot3jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findUserByIdController(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> findUsersController() {
        return ResponseEntity.ok().body(userService.findUsers());
    }

    @PostMapping
    public ResponseEntity<User> insertUserController(@RequestBody User userRequestBody) {
        User userCreated = userService.insertUser(userRequestBody);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(uri).body(userCreated);
    }
}
