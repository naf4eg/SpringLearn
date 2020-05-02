package ru.bachev.annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //используем для конфигурации вместо xml
@ComponentScan("ru.bachev.annotation") //сканируем все компоненты
public class JavaConfigReadJson {
}
