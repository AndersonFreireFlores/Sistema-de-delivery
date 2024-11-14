package com.example.delivery.Models.Item;

import com.example.delivery.Models.Restaurante.RestauranteDTO;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemDTO  {

    private  String nome;
    private  String descricao;
    private  BigDecimal preco;
    private  String imagem;
    private String categoria;
    private  RestauranteDTO restaurante;

    public ItemDTO() {
    }

    public ItemDTO(String nome, String descricao, BigDecimal preco, String imagem, String categoria, RestauranteDTO restaurante) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.categoria = categoria;
        this.restaurante = restaurante;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getImagem() {
        return imagem;
    }

    public String getCategoria() {
        return categoria;
    }

    public RestauranteDTO getRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ", " +
                "descricao = " + descricao + ", " +
                "preco = " + preco + ", " +
                "imagem = " + imagem + ", " +
                "categoria = " + categoria + ", " +
                "restaurante = " + restaurante + ")";
    }
}