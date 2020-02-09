package ru.bachev.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("AudiCar")  можно задать id бина
@Component //в getbean вызовем audi
public class Audi implements Car {

    @Autowired
    @Qualifier("audiA3Engine")
    private Engine engine;

    @Value("${model}")
    private String model;

    @Value("${speed}")
    private String speed;

    //Внедрение зависимости через конструктор
//    @Autowired
//    Audi(Engine engine){
//        this.engine = engine;
//    }

    //внедрение зависимости через сеттер
//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public String getEngine() {
        return engine.getHorsePower() + " " + engine.getVolume();
    }
}
