package org.example.gestion_des_surveillants;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionDesSurveillantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesSurveillantsApplication.class, args);
    }

    @Bean
    ApplicationRunner start(SurveillantsRepo repo) {
        return args -> {

            Stream.of(
                    new Surveillants(
                            null,
                            "Kahlaoui",
                            "Rayane",
                            "rayane@example.com",
                            "22123456",
                            "Informatique",
                            "Java",
                            true,
                            2,
                            LocalDate.of(1998, 3, 12)),
                    new Surveillants(
                            null,
                            "Belhiba",
                            "Asma",
                            "asma@example.com",
                            "22334455",
                            "Mathématiques",
                            "Analyse",
                            true,
                            1,
                            LocalDate.of(1997, 6, 22)),
                    new Surveillants(
                            null,
                            "Manai",
                            "Med Aziz",
                            "medaziz@example.com",
                            "99887766",
                            "Physique",
                            "Mécanique",
                            false,
                            3,
                            LocalDate.of(1999, 11, 5)))
                    .forEach(repo::save);

            repo.findAll().forEach(System.out::println);
        };
    }
}
