package com.example.lab1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myDog")
@Scope("prototype")
public class Dog implements IPet{
    @Override
    public void say(){
        System.out.println("Гав-Гав");
    }

    public Dog(){
        System.out.println("Class Dog: created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
