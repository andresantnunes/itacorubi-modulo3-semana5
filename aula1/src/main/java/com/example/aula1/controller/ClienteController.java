package com.example.aula1.controller;

import com.example.aula1.model.Cliente;
import com.example.aula1.model.Produto;
import com.example.aula1.service.ClienteService;
import com.example.aula1.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public void inserir(@RequestBody Cliente cliente){
        service.inserir(cliente);
    }

    @GetMapping
    public List<Cliente> listar(){
        return service.list();
    }
}
