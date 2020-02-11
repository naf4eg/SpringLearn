package ru.bachev.annotation.beanannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bachev.annotation.Car;
import ru.bachev.annotation.JavaConfigSpring;


public class ConfigJavaApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
        Car car = context.getBean("kia", Car.class);
        System.out.println(car.getModel());
        System.out.println(car.getSpeed());
        System.out.println(car.getEngine());
        context.close();
    }
}
