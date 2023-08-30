package com.example.aula1.controller;

import com.example.aula1.model.Produto;
import com.example.aula1.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @PostMapping
    public void inserir(@RequestBody Produto produto){
        service.inserir(produto);
    }

    @GetMapping
    public List<Produto> listar(){
        return service.list();
    }
}
