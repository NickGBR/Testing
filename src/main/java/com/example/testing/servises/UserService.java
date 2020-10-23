package com.example.testing.servises;

import com.example.testing.dao.User;
import com.example.testing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Map<Long,String> getTable() {
        final Iterable<User> all = userRepository.findAll();
        Map<Long, String> table = new HashMap<>();
        for (User user : all) {
            table.put(user.getId(), user.getName());
        }
        return table;
    }

    public User getById(long id){
        return userRepository.getById(id);
    }
}