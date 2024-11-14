package com.example.delivery.Models.Entregador;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EntregadorMapper {

    @Mapping(target = "id", ignore = true)
    Entregador toEntregador(EntregadorDTO entregadorDTO);

    EntregadorDTO toEntregadorDTO(Entregador entregador);
}
