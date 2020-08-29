package ru.bachev.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("AudiCar")  можно задать id бина
@Component //в getbean вызовем по умолчанию audi
@Scope("singleton") //позволяет создавать отдельный объект при prototype
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

    @PostConstruct //выполняется после инициализации бинов
    public void startEngine(){
        System.out.println("Заводим мотор...");
    }

    @PreDestroy //выполняется беред завершением бинов. !!!не работает при scope - prototype
    public void stopEngine(){
        System.out.println("Заглушили мотор...");
    }
}
