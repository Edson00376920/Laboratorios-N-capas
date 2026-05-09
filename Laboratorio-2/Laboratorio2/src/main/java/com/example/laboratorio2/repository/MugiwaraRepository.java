package com.example.laboratorio2.repository;

import com.example.laboratorio2.domain.entity.Kaizoku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MugiwaraRepository extends JpaRepository<Kaizoku, UUID> {
}
