package com.hnure.interactive.controller;

import com.hnure.interactive.jpa.User;
import com.hnure.interactive.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//cross 4200 ang
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // standard constructors

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
    @PostMapping("/deleteuser")

    void deleteUser(@RequestBody String name) {
        userRepository.deleteByName(name);
    }
}
