package fr.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class addressFormController {

    @GetMapping("/adresse")
    public String showAddresses(@RequestParam(name = "q", required = false, defaultValue = "") String addressGET, Model model) {
        model.addAttribute("addressQuery", addressGET);
        return "adresse";
    }
}
