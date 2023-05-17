package com.hexagonalexemplo.dominio.service;

import com.hexagonalexemplo.dominio.dto.ProdutoDto;
import com.hexagonalexemplo.dominio.entidades.Produto;
import com.hexagonalexemplo.dominio.portas.entrada.ProdutoServicePort;
import com.hexagonalexemplo.dominio.portas.saida.ProdutoRepositoryPort;

import java.util.List;

public class ProdutoService implements ProdutoServicePort {

    private final ProdutoRepositoryPort produtoRepositoryPort;

    public ProdutoService(ProdutoRepositoryPort produtoRepositoryPort) {
        this.produtoRepositoryPort = produtoRepositoryPort;
    }

    @Override
    public List<ProdutoDto> buscarProdutos() {
        List<Produto> produtos = this.produtoRepositoryPort.buscarTodos();
        return produtos.stream().map(Produto::toProdutoDto).toList();
    }

    @Override
    public void criarProduto(ProdutoDto produtoDTO) {
        Produto produto = new Produto(produtoDTO);
        this.produtoRepositoryPort.salvar(produto);
    }
}
