package ru.bachev.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showform")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String say(HttpServletRequest request, Model model) {

        //read the request parameter rom the HTML form
        String theName = request.getParameter("studentName").toUpperCase();
        //create the message
        String result = "Yo! " + theName;
        //add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
