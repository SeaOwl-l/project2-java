package com.example.lab1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Employee employee = context.getBean("myEmployee", Employee.class);

        employee.CallMyPet();
        employee.GetTypeOfMyCar();
        System.out.println(employee.getAge());
        System.out.println(employee.getName());

        context.close();
    }
}
