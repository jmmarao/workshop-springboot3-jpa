package com.educandoweb.workshopspringboot3jpa.config;

import com.educandoweb.workshopspringboot3jpa.entities.User;
import com.educandoweb.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Scarlet Witch", "scarlet@email.com", "00000-0000", "witch123");
        User user2 = new User(null, "Black Panther", "panther@email.com", "00000-0000", "wakanda123");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
