package com.example.lab1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myTruck")
public class Truck implements ICar{
    public Truck(){
        System.out.println("Class Truck: created");
    }

    @Override
    public void getTypeOfCar() {
        System.out.println("Машина является грузовиком");
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Truck: method init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Truck: method destroy");
    }
}
