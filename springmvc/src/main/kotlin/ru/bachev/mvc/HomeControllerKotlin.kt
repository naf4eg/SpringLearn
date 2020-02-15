package ru.bachev.mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeControllerKotlin {

    @RequestMapping("/kotlin/")
    fun showHello(): String {
        return "kotlinIndex"
    }
}