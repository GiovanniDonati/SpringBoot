package com.APISpringBoot.first_spring_app.controller;

import com.APISpringBoot.first_spring_app.domain.User;
import com.APISpringBoot.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    // -> Tem a possinilidade de criar um constructor ou usar o @autowired como usado acima
//    public HelloWorldController(HelloWorldService helloWorldService){
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping
    public String HelloWorld(){
        return helloWorldService.helloWorld("Giovanni");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(
            @PathVariable("id") String id,
            @RequestParam(value = "filter", defaultValue = "") String filter,
            @RequestBody User body
    ){
        return "Hello World" + body.getName() + id;
    }
}
