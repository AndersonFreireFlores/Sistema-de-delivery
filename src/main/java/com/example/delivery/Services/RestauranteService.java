package com.example.delivery.Services;

import com.example.delivery.Models.Restaurante.Restaurante;
import com.example.delivery.Models.Restaurante.RestauranteDTO;
import com.example.delivery.Models.Restaurante.RestauranteMapper;
import com.example.delivery.Repositories.RestauranteRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    private final RestauranteMapper restauranteMapper;

    public RestauranteService(RestauranteRepository restauranteRepository, RestauranteMapper restauranteMapper) {
        this.restauranteRepository = restauranteRepository;
        this.restauranteMapper = restauranteMapper;
    }

    public RestauranteDTO getRestauranteById(UUID id) {
        return restauranteMapper.convert(restauranteRepository.findById(id).orElseThrow(() -> new RuntimeException("Restaurante not found")));
    }
    public Set<RestauranteDTO> getAllRestaurantes() {
        return restauranteMapper.convert(restauranteRepository.findAll());
    }
    public void createRestaurante(RestauranteDTO restauranteDTO) {
        restauranteRepository.save(restauranteMapper.convert(restauranteDTO));
    }
    public void updateRestaurante(UUID id, RestauranteDTO restauranteDTO) {
        Restaurante restaurante = restauranteRepository.findById(id).orElseThrow(() -> new RuntimeException("Restaurante not found"));
        restauranteMapper.convert(restauranteDTO, restaurante);
        restauranteRepository.save(restaurante);
    }
    public void deleteRestaurante(UUID id) {
        restauranteRepository.deleteById(id);
    }
}

