package com.example.delivery.Controllers;

import com.example.delivery.Models.Restaurante.RestauranteDTO;
import com.example.delivery.Services.RestauranteService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
public class RestauranteController {

    private final RestauranteService restauranteService;

    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    @GetMapping("/restaurantes")
    public Set<RestauranteDTO> getRestaurantes() {
        return restauranteService.getAllRestaurantes();
    }

    @GetMapping("/restaurantes/{id}")
    public RestauranteDTO getRestauranteById(@PathVariable UUID id) {
        return restauranteService.getRestauranteById(id);
    }

    @PostMapping("/restaurantes")
    public void createRestaurante(RestauranteDTO restauranteDTO) {
        restauranteService.createRestaurante(restauranteDTO);
    }

    @PutMapping("/restaurantes/{id}")
    public void updateRestaurante(@PathVariable UUID id, RestauranteDTO restauranteDTO) {
        restauranteService.updateRestaurante(id, restauranteDTO);
    }

    @DeleteMapping("/restaurantes/{id}")
    public void deleteRestaurante(@PathVariable UUID id) {
        restauranteService.deleteRestaurante(id);
    }
}
