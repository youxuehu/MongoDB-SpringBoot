package com.gq.service;

import com.gq.entity.User;

public interface UserService {

    void save(User user);

    User findByName(String name);
}
