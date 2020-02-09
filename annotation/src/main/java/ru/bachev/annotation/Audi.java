package ru.bachev.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("AudiCar")  можно задать id бина
@Component //в getbean вызовем audi
public class Audi implements Car {
    private Engine engine;

    //Внедрение зависимости через конструктор
//    @Autowired
//    Audi(Engine engine){
//        this.engine = engine;
//    }

    //внедрение зависимости через сеттер
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String getSpeed() {
        return "120 km/h";
    }

    @Override
    public String getEngine() {
        return engine.getHorsePower() + " " + engine.getVolume();
    }
}
