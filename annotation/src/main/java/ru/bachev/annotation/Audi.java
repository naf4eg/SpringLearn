package ru.bachev.annotation;

import org.springframework.stereotype.Component;

//@Component("AudiCar")  можно задать id бина
@Component //в getbean вызовем audi
public class Audi implements Car {
    @Override
    public String getSpeed() {
        return "120 km/h";
    }
}
