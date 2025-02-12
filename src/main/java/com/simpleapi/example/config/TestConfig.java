package com.simpleapi.example.config;

import com.simpleapi.example.entities.Order;
import com.simpleapi.example.entities.User;
import com.simpleapi.example.repositories.OrderRepository;
import com.simpleapi.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98889888", "1234546m");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "75889848", "1234546a");
        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-08-22T15:21:22Z"), u1);
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
