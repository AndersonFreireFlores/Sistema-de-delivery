package com.example.delivery.Controllers;

import com.example.delivery.Models.Pedido.PedidoDTO;
import com.example.delivery.Services.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/pedidos/{id}")
    public PedidoDTO getPedidos(@PathVariable UUID id) {
        return pedidoService.getPedidoById(id);
    }

    @GetMapping("/pedidos")
    public Set<PedidoDTO> getPedidos() {
        return pedidoService.getPedidos();
    }

    @PostMapping("/pedidos")
    public void createPedido(@RequestBody PedidoDTO pedidoDTO) {
        pedidoService.createPedido(pedidoDTO);
    }

    @PutMapping("/pedidos/{id}")
    public void updatePedido(@PathVariable UUID id, @RequestBody PedidoDTO pedidoDTO) {
        pedidoService.updatePedido(id, pedidoDTO);
    }

    @DeleteMapping("/pedidos/{id}")
    public void deletePedido(@PathVariable UUID id) {
        pedidoService.deletePedido(id);
    }
}
