package com.example.delivery.Services;

import com.example.delivery.Models.Pedido.Pedido;
import com.example.delivery.Models.Pedido.PedidoDTO;
import com.example.delivery.Models.Pedido.PedidoMapper;
import com.example.delivery.Repositories.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    private final PedidoMapper pedidoMapper;

    public PedidoService(PedidoRepository pedidoRepository, PedidoMapper pedidoMapper) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoMapper = pedidoMapper;
    }
    public PedidoDTO getPedidoById(UUID id) {
        return pedidoMapper.convert(pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido not found")));
    }

    public Set<PedidoDTO> getPedidos() {
        return pedidoMapper.convert(pedidoRepository.findAll());
    }
    public void createPedido(PedidoDTO pedidoDTO) {
        pedidoRepository.save(pedidoMapper.convert(pedidoDTO));
    }

    public void updatePedido(UUID id, PedidoDTO pedidoDTO) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido not found"));
        pedidoMapper.convert(pedidoDTO, pedido);
        pedidoRepository.save(pedido);
    }

    public void deletePedido(UUID id) {
        pedidoRepository.deleteById(id);
    }
}
