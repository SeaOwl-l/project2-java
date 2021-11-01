package com.example.lab1;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.example.lab1")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public IPet myCat(){
        return new Cat();
    }

    @Bean
    public ICar myTruck(){
        return new Truck();
    }

    @Bean
    public Employee myEmployee(){
        return new Employee(myCat());
    }
}
