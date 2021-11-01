package com.example.lab1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCat") // myCat - id для bean
public class Cat implements IPet{
    @Override
    public void say(){
        System.out.println("Мяу-Мяу");
    }

    public Cat(){
        System.out.println("Class Cat: created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Cat: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Cat: destroy method");
    }
}
