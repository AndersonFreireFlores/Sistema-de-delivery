package com.example.delivery.Controllers;

import com.example.delivery.Models.Entregador.EntregadorDTO;
import com.example.delivery.Services.EntregadorService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
public class EntregadorController {

    private final EntregadorService entregadorService;

    public EntregadorController(EntregadorService entregadorService) {
        this.entregadorService = entregadorService;
    }

    @GetMapping("/entregadores/{id}")
    public EntregadorDTO getEntregadorById(UUID id) {
        return entregadorService.findById(id);
    }

    @GetMapping("/entregadores")
    public Set<EntregadorDTO> getEntregadores() {
        return entregadorService.findAll();
    }

    @PostMapping("/entregadores")
    public void createEntregador(@RequestBody EntregadorDTO entregadorDTO) {
        entregadorService.save(entregadorDTO);
    }

    @PutMapping("/entregadores/{id}")
    public void updateEntregador(@PathVariable UUID id, @RequestBody EntregadorDTO entregadorDTO) {
        entregadorService.update(id, entregadorDTO);
    }

    @DeleteMapping("/entregadores/{id}")
    public void deleteEntregador(@PathVariable UUID id) {
        entregadorService.deleteById(id);
    }
}
