package com.example.laboratorio2.service;

import com.example.laboratorio2.domain.entity.Kaizoku;

import java.util.List;
import java.util.UUID;

public interface MugiwaraService {
    void createKaizoku(Kaizoku kaizoku);
    List<Kaizoku> getAllKaizoku();
    Kaizoku getKaizokuById(UUID id);
    void updateKaizoku(UUID id, Kaizoku kaizoku);
    void deleteKaizoku(UUID id);
}
