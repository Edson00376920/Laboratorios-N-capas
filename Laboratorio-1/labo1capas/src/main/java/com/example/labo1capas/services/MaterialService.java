package com.example.labo1capas.services;

import com.example.labo1capas.domain.model.material;
import com.example.labo1capas.repositories.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository materialRepository;

    public List<material> sortMaterials() {
        return materialRepository.findAll().stream()
                .sorted(Comparator.comparingInt(material::getRupees).reversed())
                .toList();
    }

    public material getMostExpensiveMaterial() {
        return materialRepository.findAll().stream()
                .max(Comparator.comparingInt(material::getRupees))
                .orElse(null);
    }

    public List<material> getLegendaryMaterials() {
        return materialRepository.findAll().stream()
                .filter(m -> "Legendario".equalsIgnoreCase(m.getRarity()))
                .toList();
    }

    public List<String> getUniqueLocations() {
        return materialRepository.findAll().stream()
                .map(m -> m.getLocation()) // Usamos map en lugar de flatMap porque es un solo String
                .distinct()
                .toList();
    }
}
