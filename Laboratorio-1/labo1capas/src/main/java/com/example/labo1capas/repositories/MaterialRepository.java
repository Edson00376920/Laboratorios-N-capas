package com.example.labo1capas.repositories;

import com.example.labo1capas.common.material_list;
import com.example.labo1capas.domain.model.material;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final material_list materialList;

    public List<material> findAll(){
        return materialList.getMaterials();
    }
}
