package com.gq.service.impl;

import com.gq.entity.User;
import com.gq.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {

    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
