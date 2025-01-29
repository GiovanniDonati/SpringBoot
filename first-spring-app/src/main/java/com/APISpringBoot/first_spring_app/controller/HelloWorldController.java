package com.APISpringBoot.first_spring_app.controller;

import com.APISpringBoot.first_spring_app.controller.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping()
    public String HelloWorld(){
        return helloWorldService.helloWorld("Giovanni");
    }
}
