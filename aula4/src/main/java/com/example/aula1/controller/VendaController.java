package com.example.aula1.controller;

import com.example.aula1.model.Produto;
import com.example.aula1.model.Venda;
import com.example.aula1.service.ProdutoService;
import com.example.aula1.service.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("venda")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService service;

    @PostMapping
    public Venda inserir(
            @RequestParam Long produtoId,
            @RequestParam Long clienteId,
            @RequestParam Double desconto
    ){

        return service.venda(produtoId, clienteId, desconto);
    }

}
