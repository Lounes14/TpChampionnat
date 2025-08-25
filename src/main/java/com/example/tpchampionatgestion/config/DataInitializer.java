package com.example.tpchampionatgestion.config;

import com.example.tpchampionatgestion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        // Créer un utilisateur admin par défaut si aucun utilisateur n'existe
        if (userService.findByEmail("admin@championship.com").isEmpty()) {
            userService.createUser("Admin", "System", "admin@championship.com", "admin123");
            System.out.println("Utilisateur admin créé: admin@championship.com / admin123");
        }
    }
}

