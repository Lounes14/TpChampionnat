package com.example.tpchampionatgestion.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backoffice")
public class BackofficeController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();

        model.addAttribute("userEmail", email);
        model.addAttribute("pageTitle", "Tableau de bord - Backoffice");

        return "backoffice/dashboard";
    }

    @GetMapping("/championships")
    public String championships(Model model) {
        model.addAttribute("pageTitle", "Gestion des Championnats");
        return "backoffice/championships";
    }

    @GetMapping("/teams")
    public String teams(Model model) {
        model.addAttribute("pageTitle", "Gestion des Équipes");
        return "backoffice/teams";
    }

    @GetMapping("/games")
    public String games(Model model) {
        model.addAttribute("pageTitle", "Gestion des Matchs");
        return "backoffice/games";
    }
}

