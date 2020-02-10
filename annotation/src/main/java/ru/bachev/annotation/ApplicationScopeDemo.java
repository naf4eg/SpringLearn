package ru.bachev.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car carOne = context.getBean("audi", Car.class);
        Car carTwo = context.getBean("audi", Car.class);

        System.out.println(carOne == carTwo);
        System.out.println(carOne);
        System.out.println(carTwo);
        context.close();
    }
}
