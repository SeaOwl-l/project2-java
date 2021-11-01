package com.example.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = context.getBean("Employee", Employee.class);

        employee.CallMyPet();
        employee.GetTypeOfMyCar();
        System.out.println("Имя: " + employee.getName());
        System.out.println("Возраст: " + employee.getAge());

        context.close();
    }
}
