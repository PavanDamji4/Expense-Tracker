package com.expensetracker.controller;

import com.expensetracker.model.User;
import com.expensetracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public Optional<User> login(@RequestBody User user) {
        return userService.login(user.getEmail(), user.getPassword());
    }
}
