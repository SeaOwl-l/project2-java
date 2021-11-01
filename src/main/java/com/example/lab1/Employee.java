package com.example.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myEmployee")
public class Employee {
    private ICar myCar;
    private IPet myPet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Employee(@Qualifier("myCat") IPet pet){
        System.out.println("Class Employee: created");
        System.out.println("Class Employee: initialize Pet in construct");
        this.myPet = pet;
    }

    @Autowired
    @Qualifier("myTruck")
    public void setMyCar(ICar myCar){
        this.myCar = myCar;
        System.out.println("Class Employee : initialize Car in setter");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void CallMyPet(){
        System.out.println("Мой питомец говорит:");
        myPet.say();
    }

    public void GetTypeOfMyCar(){
        System.out.println("Тип машины:");
        myCar.getTypeOfCar();
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Employee: method init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Employee: method destroy");
    }
}
