package ru.bachev.annotation.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.bachev.annotation.Car;
import ru.bachev.annotation.Engine;

@Configuration //используем для конфигурации вместо xml
public class ConfigJava {

    @Bean //id бина при этом engineCar
    public Engine engineCar(){
        return new KiaRioEngine();
        }

    @Bean
    public Car kia() {
        return new Kia(engineCar());
    }
}
