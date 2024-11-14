package com.example.delivery.Models.Restaurante;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface RestauranteMapper {


    @Mapping(target = "id", ignore = true)
    Restaurante convert(RestauranteDTO restauranteDTO);

    RestauranteDTO convert(Restaurante restaurante);

    Set<RestauranteDTO> convert(List<Restaurante> all);

    void convert(RestauranteDTO restauranteDTO, @MappingTarget Restaurante restaurante);
}
