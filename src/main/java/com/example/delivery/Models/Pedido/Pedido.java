package com.example.delivery.Models.Pedido;

import com.example.delivery.Models.Entregador.Entregador;
import com.example.delivery.Models.Restaurante.Restaurante;
import com.example.delivery.Models.User.User;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.UUID;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NonNull
    private String endereco;

    @NonNull
    @ManyToOne
    private Restaurante restaurante;

    @NonNull
    @ManyToOne
    private User user;

    @NonNull
    @ManyToOne
    private Entregador entregador;

    @NonNull
    private Date dataPedido;

    @NonNull
    private boolean entregue;

    public Pedido() {
    }

    public Pedido(UUID id,  String endereco,  Restaurante restaurante,
                   User user,  Entregador entregador, Date dataPedido,
                  boolean entregue) {
        this.id = id;
        this.endereco = endereco;
        this.restaurante = restaurante;
        this.user = user;
        this.entregador = entregador;
        this.dataPedido = dataPedido;
        this.entregue = entregue;
    }
}
