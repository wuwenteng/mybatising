package com.mydatis.test.mybatising.controller;

import com.mydatis.test.mybatising.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/getOneUser/{id}")
    public Object getUser(@PathVariable int id) {
        return service.selectUserById(id);
    }
}
