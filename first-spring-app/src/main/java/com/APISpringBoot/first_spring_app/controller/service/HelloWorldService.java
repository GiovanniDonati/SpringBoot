package com.APISpringBoot.first_spring_app.controller.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}
