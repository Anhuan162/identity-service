package com.huan.identify_service.controller;

import com.huan.identify_service.dto.CreateUserRequest;
import com.huan.identify_service.dto.UpdateUserRequest;
import com.huan.identify_service.entity.User;
import com.huan.identify_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody @Valid CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody @Valid UpdateUserRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return "user has been deleted";
    }

}
