package com.MathLabs.MathLabs.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PublicationsController {

    @GetMapping("/publications")
    public String publications(Model model) {
        return "publications";
    }
}
