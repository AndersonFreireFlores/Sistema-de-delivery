package com.example.delivery.Models.Pedido;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

    @Mapping(target = "id", ignore = true)
    Pedido convert(PedidoDTO pedidoDTO);

    PedidoDTO convert(Pedido pedido);
}
