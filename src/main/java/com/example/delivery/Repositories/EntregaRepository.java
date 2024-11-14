package com.example.delivery.Repositories;

import com.example.delivery.Models.Entregador.Entregador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EntregaRepository extends JpaRepository<Entregador, UUID> {
}
