package com.example.labo1capas.common;

import com.example.labo1capas.domain.model.material;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class material_list {
    private final List<material> materials;

    public material_list(){
        this.materials = new ArrayList<>();

        this.materials.add(material.builder()
                .name("Diamante")
                .category("Mineral")
                .effect("Ninguno")
                .rupees(500)
                .location("Hyrule")
                .rarity("Legendario")
                .build());

        this.materials.add(material.builder()
                .name("Solirio")
                .category("Planta")
                .effect("Cura Aura maligna")
                .rupees(8)
                .location("Islas del cielo")
                .rarity("Poco comun")
                .build());

        this.materials.add(material.builder()
                .name("Leche fresca")
                .category("Comida")
                .effect("Corazones")
                .rupees(12)
                .location("Aldea hatelia")
                .rarity("Comun")
                .build());

        this.materials.add(material.builder()
                .name("Cuerno de lizalfos")
                .category("Parte de monstruo")
                .effect("Ataque")
                .rupees(8)
                .location("Pantanos y costas")
                .rarity("Comun")
                .build());

        this.materials.add(material.builder()
                .name("Grillo vagabundo")
                .category("Animal")
                .effect("Estamina")
                .rupees(2)
                .location("Pradera de Hyrule")
                .rarity("Comun")
                .build());

        this.materials.add(material.builder()
                .name("Seta gélida")
                .category("Seta")
                .effect("Resistencia al calor")
                .rupees(4)
                .location("Cordillera de Hebra")
                .rarity("Poco comun")
                .build());

        this.materials.add(material.builder()
                .name("Lagarto vivaz")
                .category("Animal")
                .effect("Corazones")
                .rupees(10)
                .location("Posta del bosque")
                .rarity("Poco comun")
                .build());

        this.materials.add(material.builder()
                .name("Viscera de horroblin")
                .category("Parte de monstruo")
                .effect("Aumentar duración")
                .rupees(25)
                .location("Cuevas")
                .rarity("Poco comun")
                .build());

        this.materials.add(material.builder()
                .name("Cuerno de centaleon")
                .category("Parte de monstruo")
                .effect("Aumentar duración")
                .rupees(40)
                .location("Llanura de hyrule")
                .rarity("Alta")
                .build());
    }
}
