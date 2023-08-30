package com.example.aula1.repository;

import com.example.aula1.model.Cliente;
import com.example.aula1.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
