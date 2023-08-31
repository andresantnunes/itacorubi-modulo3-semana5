package com.example.aula1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Cliente cliente;

    private Double desconto;

    public Venda(Cliente cliente, Produto produto, Double desconto) {
        this.produto = produto;
        this.cliente = cliente;
        this.desconto = desconto;
    }
}
