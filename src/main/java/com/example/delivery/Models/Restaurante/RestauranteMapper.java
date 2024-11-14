package com.example.delivery.Models.Restaurante;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RestauranteMapper {


    @Mapping(target = "id", ignore = true)
    Restaurante convert(RestauranteDTO restauranteDTO);

    RestauranteDTO convert(Restaurante restaurante);
}
