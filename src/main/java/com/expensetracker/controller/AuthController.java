package com.expensetracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.expensetracker.dto.UserDto;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // frontend JS साठी allow करा
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserDto userDto) {
        // 👉 इकडे तुझी DB logic लिही (userRepo.save etc.)
        System.out.println("Signup called for: " + userDto.getEmail());
        return ResponseEntity.ok().body("User registered successfully");
    }
}
