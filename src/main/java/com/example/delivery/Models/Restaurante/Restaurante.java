package com.example.delivery.Models.Restaurante;

import com.example.delivery.Models.Item.Item;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Set;
import java.util.UUID;

@Entity
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NonNull
    private String nome;
    @NonNull
    private String endereco;
    @NonNull
    private String telefone;
    @OneToMany(mappedBy = "restaurante")
    private Set<Item> itens;

    public Restaurante() {
    }

    public Restaurante(UUID id, @NonNull String nome, @NonNull String endereco, @NonNull String telefone, Set<Item> itens) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.itens = itens;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
}
