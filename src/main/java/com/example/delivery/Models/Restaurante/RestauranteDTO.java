package com.example.delivery.Models.Restaurante;

import com.example.delivery.Models.Item.ItemDTO;

import java.util.Set;

public class RestauranteDTO {

    private String nome;
    private String endereco;
    private String telefone;
    private Set<ItemDTO> itens;

    public RestauranteDTO() {
    }

    public RestauranteDTO(String nome, String endereco, String telefone, Set<ItemDTO> itens) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Set<ItemDTO> getItens() {
        return itens;
    }

    public void setItens(Set<ItemDTO> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "RestauranteDTO{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", itens=" + itens +
                '}';
    }
}
