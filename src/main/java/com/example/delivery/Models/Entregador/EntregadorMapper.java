package com.example.delivery.Models.Entregador;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface EntregadorMapper {

    @Mapping(target = "id", ignore = true)
    Entregador convert(EntregadorDTO entregadorDTO);

    EntregadorDTO convert(Entregador entregador);

    Set<EntregadorDTO> convert(List<Entregador> all);

    void convert(EntregadorDTO entregadorDTO,@MappingTarget Entregador entregador);
}
