package ru.bachev.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("AudiCar", Car.class);
        System.out.println(car.getSpeed());
    }
}
