package com.example.delivery.Models.Entregador;

import com.example.delivery.Models.Pedido.PedidoDTO;
import com.example.delivery.Models.User.UserDTO;

import java.util.Set;

public class EntregadorDTO extends UserDTO {

    private String placaVeiculo;
    private String modeloVeiculo;
    private String corVeiculo;

    public EntregadorDTO() {
    }

    public EntregadorDTO(String placaVeiculo, String modeloVeiculo, String corVeiculo) {
        this.placaVeiculo = placaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.corVeiculo = corVeiculo;
    }

    public EntregadorDTO(String nome, String email, String telefone, Set<PedidoDTO> pedidos, String placaVeiculo, String modeloVeiculo, String corVeiculo) {
        super(nome, email, telefone, pedidos);
        this.placaVeiculo = placaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.corVeiculo = corVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    @Override
    public String toString() {
        return "EntregadorDTO{" +
                "placaVeiculo='" + placaVeiculo + '\'' +
                ", modeloVeiculo='" + modeloVeiculo + '\'' +
                ", corVeiculo='" + corVeiculo + '\'' +
                '}';
    }
}
