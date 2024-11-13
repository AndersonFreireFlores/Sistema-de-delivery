package com.example.delivery.Models.Item;

import com.example.delivery.Models.Restaurante.Restaurante;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NonNull
    private String nome;
    @NonNull
    private String descricao;
    @NonNull
    private BigDecimal preco;
    @NonNull
    private String imagem;
    @NonNull
    private String categoria;

    @NonNull
    @ManyToOne
    private Restaurante restaurante;

    public Item() {
    }

    public Item(UUID id, String nome, String descricao, BigDecimal preco, String imagem, String categoria, Restaurante restaurante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.categoria = categoria;
        this.restaurante = restaurante;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @NonNull
    public String getNome() {
        return nome;
    }

    public void setNome(@NonNull String nome) {
        this.nome = nome;
    }

    @NonNull
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NonNull String descricao) {
        this.descricao = descricao;
    }

    @NonNull
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(@NonNull BigDecimal preco) {
        this.preco = preco;
    }

    @NonNull
    public String getImagem() {
        return imagem;
    }

    public void setImagem(@NonNull String imagem) {
        this.imagem = imagem;
    }

    @NonNull
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NonNull String categoria) {
        this.categoria = categoria;
    }

    @NonNull
    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(@NonNull Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
