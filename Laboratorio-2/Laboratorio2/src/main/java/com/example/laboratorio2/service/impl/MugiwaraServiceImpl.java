package com.example.laboratorio2.service.impl;

import com.example.laboratorio2.domain.entity.Kaizoku;
import com.example.laboratorio2.repository.MugiwaraRepository;
import com.example.laboratorio2.service.MugiwaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MugiwaraServiceImpl implements MugiwaraService {
    private final MugiwaraRepository mugiwaraRepository;

    @Override
    public void createKaizoku(Kaizoku kaizoku) {
        mugiwaraRepository.save(kaizoku);
    }

    @Override
    public List<Kaizoku> getAllKaizoku() {
        return mugiwaraRepository.findAll();
    }

    @Override
    public Kaizoku getKaizokuById(UUID id) {
        return mugiwaraRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pirata no encontrado con ID: " + id));
    }

    @Override
    public void updateKaizoku(UUID id, Kaizoku kaizoku) {
        Kaizoku existingKaizoku = getKaizokuById(id);

        existingKaizoku.setName(kaizoku.getName());
        existingKaizoku.setBounty(kaizoku.getBounty());
        existingKaizoku.setCrew(kaizoku.getCrew());
        existingKaizoku.setIsAlive(kaizoku.getIsAlive());

        mugiwaraRepository.save(existingKaizoku);
    }

    @Override
    public void deleteKaizoku(UUID id) {
        Kaizoku kaizoku = getKaizokuById(id);
        mugiwaraRepository.delete(kaizoku);
    }
}
