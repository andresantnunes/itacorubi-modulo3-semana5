package com.example.aula1.repository;

import com.example.aula1.model.Produto;
import com.example.aula1.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}
