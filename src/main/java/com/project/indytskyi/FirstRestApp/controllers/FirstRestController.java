package com.project.indytskyi.FirstRestApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // тоже самое что @Controller + @ResponseBody над каждым методом
@RequestMapping("/api")
public class FirstRestController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
