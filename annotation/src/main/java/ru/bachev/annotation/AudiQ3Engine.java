package ru.bachev.annotation;

import org.springframework.stereotype.Component;

@Component
public class AudiQ3Engine implements Engine {
    @Override
    public String getVolume() {
        return "3.0 литра";
    }

    @Override
    public String getHorsePower() {
        return "230 л.с";
    }
}
