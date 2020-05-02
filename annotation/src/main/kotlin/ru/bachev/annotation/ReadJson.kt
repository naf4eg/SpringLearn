package ru.bachev.annotation

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.util.ResourceUtils
import java.io.File

fun main() {
    val context = AnnotationConfigApplicationContext(JavaConfigReadJson::class.java)
    val json = context.getBean("jsonRead", JsonRead::class.java)

    println(json.resourceFile.uri.path)

    val objectMapper = ObjectMapper()
    val str = objectMapper.readValue(File(json.resourceFile.uri), JsonRead::class.java)
    println("Имя: ${str.name}\n" +
            "Фамилия: ${str.lastName}\n" +
            "email: ${str.email}\n" +
            "возраст: ${str.age}\n\n")


    val path = ResourceUtils.getFile("classpath:andrey.json")
    println(path)
    val objectMapper2 = ObjectMapper()
    val str2 = objectMapper2.readValue(File(path.toURI()), JsonRead::class.java)
    println("Имя: ${str2.name}\n" +
            "Фамилия: ${str2.lastName}\n" +
            "email: ${str2.email}\n" +
            "возраст: ${str2.age}\n")


    context.close()
}