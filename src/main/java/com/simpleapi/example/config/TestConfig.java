package com.simpleapi.example.config;

import com.simpleapi.example.entities.User;
import com.simpleapi.example.repositories.UserRepository;
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

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98889888", "1234546m");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "75889848", "1234546a");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
