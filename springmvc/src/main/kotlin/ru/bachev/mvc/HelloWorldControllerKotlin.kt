package ru.bachev.mvc

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("/kotlin")
class HelloWorldControllerKotlin {
    @RequestMapping("/showForm")
    fun showForm(): String {
        return "helloworld-form"
    }

    @RequestMapping("/processForm")
    fun processForm(): String {
        return "helloworld"
    }

    @RequestMapping("/processFormVersion")
    fun sayOne(request: HttpServletRequest, model: Model): String {
        val name: String = request.getParameter("studentName").toUpperCase()
        val message: String = "YO KOTLIN! $name"
        model.addAttribute("message", message)

        return "helloworld"
    }

    @RequestMapping("/processFormVersionTwo")
    fun sayTwo(@RequestParam("studentName") name: String,
            model: Model): String {

        val message: String = "YO KOTLIN, FORM 2V! ${name.toUpperCase()}"
        model.addAttribute("message", message)

        return "helloworld"
    }
}