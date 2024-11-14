package com.example.delivery.Models.Restaurante;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RestauranteMapping {


    @Mapping(target = "id", ignore = true)
    Restaurante toEntity(RestauranteDTO restauranteDTO);

    RestauranteDTO toDTO(Restaurante restaurante);
}
