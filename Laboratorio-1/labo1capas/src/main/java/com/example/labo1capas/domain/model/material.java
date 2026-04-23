package com.example.labo1capas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class material {
    private String name;
    private String category;
    private String effect;
    private Integer rupees;
    private String location;
    private String rarity;
}
