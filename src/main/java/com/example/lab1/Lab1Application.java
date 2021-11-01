package com.example.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@SpringBootApplication
public class Lab1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }

    @GetMapping("/hello")
    public String Hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s!" ,name);
    }

    @GetMapping("/about")
    public String About(){
        String str = "about us";
        return str;
    }

    @GetMapping("/options")
    public String Options(@RequestParam(required = false) String options){
        String str = "";
        if(options == null) str = "options";
        else str = "not an option";
        return str;
    }

}
