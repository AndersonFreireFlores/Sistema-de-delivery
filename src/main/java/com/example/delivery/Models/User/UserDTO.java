package com.example.delivery.Models.User;

import com.example.delivery.Models.Pedido.PedidoDTO;

import java.util.Set;

public class UserDTO {

    private String nome;
    private String email;
    private String telefone;
    private Set<PedidoDTO> pedidos;

    public UserDTO() {
    }

    public UserDTO(String nome, String email, String telefone, Set<PedidoDTO> pedidos) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Set<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}
