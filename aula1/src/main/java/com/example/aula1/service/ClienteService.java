package com.example.aula1.service;

import com.example.aula1.model.Cliente;
import com.example.aula1.model.Produto;
import com.example.aula1.repository.ClienteRepository;
import com.example.aula1.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public void inserir(Cliente cliente){
        repository.save(cliente);
    }

    public List<Cliente> list(){
        return repository.findAll();
    }
}
