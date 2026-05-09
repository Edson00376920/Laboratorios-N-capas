package com.example.laboratorio2.controller;

import com.example.laboratorio2.domain.entity.Kaizoku;
import com.example.laboratorio2.service.impl.MugiwaraServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pirates")
@AllArgsConstructor
public class MugiwaraController {
    private final MugiwaraServiceImpl mugiwaraService;

    @PostMapping("/create")
    public ResponseEntity<Kaizoku> createProduct(@RequestBody Kaizoku kaizoku) {
        mugiwaraService.createKaizoku(kaizoku);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(kaizoku);
    }

    @GetMapping
    public ResponseEntity<List<Kaizoku>> getAll() {
        return ResponseEntity.ok(mugiwaraService.getAllKaizoku());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kaizoku> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(mugiwaraService.getKaizokuById(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Kaizoku> update(@PathVariable UUID id, @RequestBody Kaizoku kaizoku) {
        mugiwaraService.updateKaizoku(id, kaizoku);
        return ResponseEntity.ok(kaizoku);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        mugiwaraService.deleteKaizoku(id);
        return ResponseEntity.noContent().build();
    }
}
