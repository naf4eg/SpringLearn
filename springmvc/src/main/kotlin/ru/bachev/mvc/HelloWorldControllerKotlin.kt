package ru.bachev.mvc

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@Controller
class HelloWorldControllerKotlin {
    @RequestMapping("/kt/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/kt/processForm")
    fun processForm(): String {
        return "helloworld"
    }

    @RequestMapping("/kt/processFormVersionTwo")
    fun say(request: HttpServletRequest, model: Model): String {
        val name: String = request.getParameter("studentName").toUpperCase()
        val message: String = "YO KOTLIN! $name"
        model.addAttribute("message", message)

        return "helloworld"
    }
}