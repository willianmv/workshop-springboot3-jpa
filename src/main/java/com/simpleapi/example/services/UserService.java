package com.simpleapi.example.services;

import com.simpleapi.example.entities.User;
import com.simpleapi.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

}
