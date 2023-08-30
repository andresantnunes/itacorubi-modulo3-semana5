package com.example.aula1.service;

import com.example.aula1.model.Cliente;
import com.example.aula1.model.Produto;
import com.example.aula1.model.Venda;
import com.example.aula1.repository.ClienteRepository;
import com.example.aula1.repository.ProdutoRepository;
import com.example.aula1.repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VendaService {

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;
    private final VendaRepository vendaRepository;

    public Venda venda(Long produtoId, Long clienteId, Double desconto) {

        Cliente cliente = clienteRepository.findById(clienteId).get();
        Produto produto = produtoRepository.findById(produtoId).get();

        return vendaRepository.save(new Venda(cliente,produto,desconto));

    }
}
