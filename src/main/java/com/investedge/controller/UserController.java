package com.investedge.controller;

import com.investedge.model.User;
import com.investedge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    @PostMapping("/changePassword")
    public ResponseEntity<?> changePassword(@RequestParam Long userId, @RequestParam String oldPassword, @RequestParam String newPassword) {
        boolean isChanged = userService.changePassword(userId, oldPassword, newPassword);
        if (isChanged) {
            return ResponseEntity.ok("Password changed successfully");
        } else {
            return ResponseEntity.badRequest().body("Password change failed");
        }
    }
}
