package com.example.labo1capas;

import com.example.labo1capas.services.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo1capasApplication {

    public static void main(String[] args) {
        SpringApplication.run(Labo1capasApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(MaterialService materialService){
        return args -> {
            System.out.println("\n=== Precios de los materiales  ===");
            materialService.sortMaterials().forEach(p->
                    System.out.println("[HYRULE-DB] " + "Nombre: " + p.getName() + " | " + "Categoria: " + p.getCategory() + " | " + "Precio: " + p.getRupees() )
            );

            System.out.println("\n=== Material más caro ===");
            var pCaro = materialService.getMostExpensiveMaterial();
            if (pCaro != null) {
                System.out.println("[HYRULE-DB] " + "Nombre: " + pCaro.getName() + " | " + "Categoria: " + pCaro.getCategory() + " | " + "Precio: " + pCaro.getRupees());
            }

            System.out.println("\n=== materiales legendarios ===");
            materialService.getLegendaryMaterials().forEach(p->
                    System.out.println("[HYRULE-DB] " + "Nombre: " + p.getName() + " | " + "Categoria: " + p.getCategory() + " | " + "Precio: " + p.getRupees() )
            );

            System.out.println("\n=== Ubicaciones registradas ===");
            materialService.getUniqueLocations().forEach(loc ->
                    System.out.println("[HYRULE-DB] Ubicación: " + loc)
            );
        };
    }
}