package com.hexagonalexemplo.dominio.portas.saida;

import com.hexagonalexemplo.dominio.entidades.Produto;

import java.util.List;

public interface ProdutoRepositoryPort {

    List<Produto> buscarTodos();
    void salvar(Produto produto);
}
