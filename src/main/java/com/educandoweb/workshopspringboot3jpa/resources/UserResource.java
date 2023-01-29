package com.educandoweb.workshopspringboot3jpa.resources;

import com.educandoweb.workshopspringboot3jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Test Dev", "test@email.com", "0000-0000", "password");
        return ResponseEntity.ok().body(user);
    }
}
