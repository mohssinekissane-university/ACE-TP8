package com.mohssinekissane.acetp7;

import com.mohssinekissane.acetp7.entities.Compte;
import com.mohssinekissane.acetp7.entities.TypeCompte;
import com.mohssinekissane.acetp7.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class AceTp7Application {

    public static void main(String[] args) {
        SpringApplication.run(AceTp7Application.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(null, new Date(), Math.random()*9000, TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, new Date(), Math.random()*9000, TypeCompte.COURANT));
            compteRepository.save(new Compte(null, new Date(), Math.random()*9000, TypeCompte.EPARGNE));

            compteRepository.findAll().forEach(c -> {
                System.out.println(c.toString());
            });
        };
    }
}
