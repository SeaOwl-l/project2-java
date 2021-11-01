package com.example.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat myCat = context.getBean("myCat", Cat.class);
//        myCat.say();-

        Employee employee = context.getBean("myEmployee", Employee.class);
        employee.CallMyPet();
        employee.GetTypeOfMyCar();

        System.out.println(employee.getAge());
        System.out.println(employee.getName());


        int many = 10;

        ArrayList<IPet> manyCats = new ArrayList<IPet>(many);
        for (int i = 0; i < many;i++){
            manyCats.add(context.getBean("myCat", Cat.class));
        }

        ArrayList<IPet> manyDogs = new ArrayList<IPet>();
        for (int i = 0; i < many;i++){
            manyDogs.add(context.getBean("myDog", Dog.class));
        }

        context.close();
    }
}
