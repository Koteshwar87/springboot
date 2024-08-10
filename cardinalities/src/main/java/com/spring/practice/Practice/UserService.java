package com.spring.practice.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

//    private final UserRepository userRepository;
    private UserRepository userRepository;

    /*@Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/

    // Default constructor
    public UserService() {
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}