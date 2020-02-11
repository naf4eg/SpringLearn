package ru.bachev.annotation

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ru.bachev.annotation.beanannotation.ConfigJava

fun main() {
    val context = AnnotationConfigApplicationContext(ConfigJava::class.java)
    val car = context.getBean("kia", Car::class.java)
    println(car.model)
    println(car.speed)
    println(car.engine)
    context.close()
}