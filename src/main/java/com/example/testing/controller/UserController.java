package com.example.testing.controller;

import com.example.testing.dao.User;
import com.example.testing.servises.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("dbservice/users")
    public Map<Long, String> getTable() {
        return userService.getTable();
    }


    @GetMapping("/dbservice/users/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }
}