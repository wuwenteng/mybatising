package com.mydatis.test.mybatising.controller;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mydatis.test.mybatising.config.dao.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
public class ResourceController {
    @Autowired
    private Resource resource;

    @GetMapping("/resource")
    public Resource get() throws UnsupportedEncodingException {
        Resource bean = new Resource();

        bean.setUsername(resource.getUsername());
        bean.setPassword(resource.getPassword());
        System.out.println(bean.getUsername());
        return bean;
    }
}
