package com.hexagonalexemplo.dominio.portas.entrada;

import com.hexagonalexemplo.dominio.dto.ProdutoDto;

import java.util.List;

public interface ProdutoServicePort {
    List<ProdutoDto> buscarProdutos();

    void criarProduto(ProdutoDto produtoDTO);

}