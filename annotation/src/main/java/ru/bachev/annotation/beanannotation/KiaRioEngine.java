package ru.bachev.annotation.beanannotation;

import ru.bachev.annotation.Engine;

public class KiaRioEngine implements Engine {
    @Override
    public String getVolume() {
        return "1.4 литра";
    }

    @Override
    public String getHorsePower() {
        return "350 л.с";
    }
}
