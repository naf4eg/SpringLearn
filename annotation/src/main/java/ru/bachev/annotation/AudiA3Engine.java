package ru.bachev.annotation;

import org.springframework.stereotype.Component;

@Component
public class AudiA3Engine implements Engine{
    @Override
    public String getVolume() {
        return "2.0 литров";
    }

    @Override
    public String getHorsePower() {
        return "150 л.с";
    }
}
