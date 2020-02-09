package ru.bachev.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("audi", Car.class);
        System.out.println(car.getSpeed());
        System.out.println(car.getEngine());
        context.close();
    }
}
