package ru.bachev.mvc

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/pacient")
class PacientController {

    @Value("#{countryOptions}")
    val countryOptions: Map<String, String> = mapOf()

    @RequestMapping("/showForm")
    fun showForm(model: Model): String {
        var pacient = Pacient()
        model.addAttribute("pacient", pacient)
        model.addAttribute("countryOptions", countryOptions)
        return "pacient-form"
    }

    //передадим из формы пациента в форму пациента подтверждение
    @RequestMapping("/processForm")
    fun processForm(@ModelAttribute("pacient") pacient: Pacient): String{
        return "pacient-confirmation"
    }
}