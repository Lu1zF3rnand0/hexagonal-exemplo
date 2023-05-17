package com.hexagonalexemplo.adaptadores.entrada.controller;

import com.hexagonalexemplo.dominio.dto.ProdutoDto;
import com.hexagonalexemplo.dominio.portas.entrada.ProdutoServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoServicePort produtoServicePort;

    public ProdutoController(ProdutoServicePort produtoServicePort) {
        this.produtoServicePort = produtoServicePort;
    }

    @PostMapping
    void criarProdutos(@RequestBody ProdutoDto produtoDto) {
        produtoServicePort.criarProduto(produtoDto);
    }

    @GetMapping
    List<ProdutoDto> getProdutos() {
        return produtoServicePort.buscarProdutos();
    }

}