package com.example.delivery.Services;

import com.example.delivery.Models.Entregador.Entregador;
import com.example.delivery.Models.Entregador.EntregadorDTO;
import com.example.delivery.Models.Entregador.EntregadorMapper;
import com.example.delivery.Repositories.EntregadorRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class EntregadorService {

    private final EntregadorRepository entregadorRepository;

    private final EntregadorMapper entregadorMapper;

    public EntregadorService(EntregadorRepository entregadorRepository, EntregadorMapper entregadorMapper) {
        this.entregadorRepository = entregadorRepository;
        this.entregadorMapper = entregadorMapper;
    }

    public EntregadorDTO findById(UUID id) {
        return entregadorMapper.convert(entregadorRepository.findById(id).orElseThrow());
    }

    public Set<EntregadorDTO> findAll() {
        return entregadorMapper.convert(entregadorRepository.findAll());
    }

    public void save(EntregadorDTO entregadorDTO) {
        entregadorRepository.save(entregadorMapper.convert(entregadorDTO));
    }

    public void update(UUID id, EntregadorDTO entregadorDTO) {
        Entregador entregador = entregadorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Entregador não encontrado"));
        entregadorMapper.convert(entregadorDTO, entregador);
        entregadorRepository.save(entregador);
    }
    public void deleteById(UUID id) {
        entregadorRepository.deleteById(id);
    }
}
