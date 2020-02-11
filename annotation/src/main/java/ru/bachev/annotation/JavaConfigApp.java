package ru.bachev.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigSpring.class);
        Car car = context.getBean("audi", Car.class);
        System.out.println(car.getModel());
        System.out.println(car.getSpeed());
        System.out.println(car.getEngine());
        context.close();
    }
}
