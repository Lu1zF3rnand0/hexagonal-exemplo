package com.hexagonalexemplo.dominio.entidades;

import com.hexagonalexemplo.dominio.dto.ProdutoDto;

import java.util.UUID;

public class Produto {

    private UUID codigo;
    private final String nome;
    private final String preco;
    private final String quantidade;

    public Produto(UUID codigo, String nome, String preco, String quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(ProdutoDto produtoDto) {
        this.nome = produtoDto.nome();
        this.preco = produtoDto.preco();
        this.quantidade = produtoDto.quantidade();
    }

    public ProdutoDto toProdutoDto() {
        return new ProdutoDto(this.nome, this.preco, this.quantidade);
    }

    public UUID getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

}
