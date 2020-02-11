package ru.bachev.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //используем для конфигурации вместо xml
@ComponentScan("ru.bachev.annotation") //сканируем все компоненты
@PropertySource("car.properties") //файл с пропертями
public class JavaConfigSpring {
}
