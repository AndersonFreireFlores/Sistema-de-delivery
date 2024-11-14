package com.example.delivery.Services;


import com.example.delivery.Models.User.User;
import com.example.delivery.Models.User.UserDTO;
import com.example.delivery.Models.User.UserMapper;
import com.example.delivery.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO getUserById(UUID id) {
        return userMapper.convert(userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found")));
    }

    public Set<UserDTO> getAllUsers() {
        return userMapper.convert(userRepository.findAll());
    }

    public void createUser(UserDTO userDTO) {
        userRepository.save(userMapper.convert(userDTO));
    }

    public void updateUser(UUID id, UserDTO userDTO) {
    User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    userMapper.convert(userDTO, user);
    userRepository.save(user);
}

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
