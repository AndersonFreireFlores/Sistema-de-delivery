package com.example.delivery.Models.Pedido;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

    @Mapping(target = "id", ignore = true)
    Pedido convert(PedidoDTO pedidoDTO);

    PedidoDTO convert(Pedido pedido);

    void convert(PedidoDTO pedidoDTO,@MappingTarget Pedido pedido);

    Set<PedidoDTO> convert(List<Pedido> all);
}
