package com.example.delivery.Models.Entregador;

import com.example.delivery.Models.Pedido.Pedido;
import com.example.delivery.Models.User.User;
import jakarta.persistence.Entity;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.Set;
import java.util.UUID;


@Entity
public class Entregador extends User {

    @NonNull
    private String placaVeiculo;

    @NonNull
    private String modeloVeiculo;

    @NonNull
    private String corVeiculo;

    @NonNull
    private String cpf;

    public Entregador() {
    }

    public Entregador( String placaVeiculo, String modeloVeiculo, String corVeiculo, String cpf) {
        this.placaVeiculo = placaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.corVeiculo = corVeiculo;
        this.cpf = cpf;
    }

    public Entregador(UUID id, String nome, String email, String senha, String telefone, Set<Pedido> entregases,
                      boolean ativo, Date dataCriacao,  String placaVeiculo, String modeloVeiculo,
                      String corVeiculo, String cpf) {
        super(id, nome, email, senha, telefone, entregases, ativo, dataCriacao);
        this.placaVeiculo = placaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.corVeiculo = corVeiculo;
        this.cpf = cpf;
    }

    @NonNull
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(@NonNull String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    @NonNull
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(@NonNull String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    @NonNull
    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(@NonNull String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    @NonNull
    public String getCpf() {
        return cpf;
    }

    public void setCpf(@NonNull String cpf) {
        this.cpf = cpf;
    }
}
