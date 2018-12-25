package com.gq.controller;

import com.gq.entity.User;
import com.gq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * save use before findName
     * @return
     */
    @GetMapping("/save")
    public User save() {
        User user = new User(2, "Tseng", 21);
        mongoTemplate.save(user);
        return user;
    }

    @GetMapping("/find")
    public List<User> find() {
        List<User> userList = mongoTemplate.findAll(User.class);
        return userList;
    }

    /**
     * input String name "Tseng"
     * @param name
     * @return
     */
    @GetMapping("/findByName")
    public User findByName(@RequestParam("name") String name) {
        User user = userService.findByName(name);
        return user;
    }
}
