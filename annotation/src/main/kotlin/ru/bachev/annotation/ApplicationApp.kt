package ru.bachev.annotation

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val car = context.getBean("audi", Car::class.java)
    println(car.speed)
    println(car.engine)
    context.close()
}