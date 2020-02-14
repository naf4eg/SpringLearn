package ru.bachev.mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloWorldControllerKotlin {
    @RequestMapping("/kt/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/kt/processForm")
    fun processForm(): String{
        return "helloworld"
    }
}