package com.example.delivery.Models.User;

import com.example.delivery.Models.Pedido.Pedido;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NonNull
    private String nome;

    @NonNull
    private String email;

    @NonNull
    private String senha;

    @NonNull
    private String telefone;

    @OneToMany(mappedBy = "user")
    private Set<Pedido> pedidos;

    @NonNull
    private boolean ativo;

    @NonNull
    private Date dataCriacao;

    public User() {
    }

    public User(UUID id, String nome, String email, String senha, String telefone, Set<Pedido> entregases, boolean ativo, Date dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.pedidos = entregases;
        this.ativo = ativo;
        this.dataCriacao = dataCriacao;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getSenha() {
        return senha;
    }

    public void setSenha(@NonNull String senha) {
        this.senha = senha;
    }

    @NonNull
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NonNull String telefone) {
        this.telefone = telefone;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @NonNull
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(@NonNull Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
