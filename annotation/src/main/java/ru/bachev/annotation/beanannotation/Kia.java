package ru.bachev.annotation.beanannotation;

import ru.bachev.annotation.Car;
import ru.bachev.annotation.Engine;

public class Kia implements Car {

    private Engine engine;

    public Kia(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return "Kia";
    }

    @Override
    public String getSpeed() {
        return "300 km/h";
    }

    @Override
    public String getEngine() {
        return engine.getHorsePower() + " " + engine.getVolume();
    }
}
