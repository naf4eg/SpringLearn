package ru.bachev.annotation

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext(JavaConfigSpring::class.java)
    val car = context.getBean("audi", Car::class.java)
    println(car.model)
    println(car.speed)
    println(car.engine)
    context.close()
}