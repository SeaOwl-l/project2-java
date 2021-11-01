package com.example.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        context.close();
    }
}
