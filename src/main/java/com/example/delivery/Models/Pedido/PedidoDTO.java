package com.example.delivery.Models.Pedido;

import com.example.delivery.Models.Entregador.EntregadorDTO;
import com.example.delivery.Models.Restaurante.RestauranteDTO;
import com.example.delivery.Models.User.UserDTO;

public class PedidoDTO {

    private String endereco;
    private RestauranteDTO restaurante;
    private UserDTO user;
    private EntregadorDTO entregador;
    private String dataPedido;
    private boolean entregue;

    public PedidoDTO() {
    }

    public PedidoDTO(String endereco, RestauranteDTO restaurante, UserDTO user, EntregadorDTO entregador, String dataPedido, boolean entregue) {
        this.endereco = endereco;
        this.restaurante = restaurante;
        this.user = user;
        this.entregador = entregador;
        this.dataPedido = dataPedido;
        this.entregue = entregue;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public RestauranteDTO getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(RestauranteDTO restaurante) {
        this.restaurante = restaurante;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public EntregadorDTO getEntregador() {
        return entregador;
    }

    public void setEntregador(EntregadorDTO entregador) {
        this.entregador = entregador;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" +
                "endereco='" + endereco + '\'' +
                ", restaurante=" + restaurante +
                ", user=" + user +
                ", entregador=" + entregador +
                ", dataPedido='" + dataPedido + '\'' +
                ", entregue=" + entregue +
                '}';
    }
}
