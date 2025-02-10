package com.huan.identify_service.service;

import com.huan.identify_service.dto.CreateUserRequest;
import com.huan.identify_service.dto.UpdateUserRequest;
import com.huan.identify_service.entity.User;
import com.huan.identify_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User createUser(CreateUserRequest request) {
        return userRepository.save(User.from(request));
    }

    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(String userId, UpdateUserRequest request) {
        User user = getUser(userId);
        user.setDob(request.getDob());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
