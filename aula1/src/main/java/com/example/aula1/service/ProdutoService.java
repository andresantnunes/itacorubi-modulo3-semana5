package com.example.aula1.service;

import com.example.aula1.model.Produto;
import com.example.aula1.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public void inserir(Produto produto){
        repository.save(produto);
    }

    public List<Produto> list(){
        return repository.findAll();
    }
}
