package com.example.delivery.Controllers;

import com.example.delivery.Models.User.UserDTO;
import com.example.delivery.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Set<UserDTO> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserDTO getUserById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody UserDTO userDTO) {
        userService.createUser(userDTO);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@PathVariable UUID id, @RequestBody UserDTO userDTO) {
        userService.updateUser(id, userDTO);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
    }
}
