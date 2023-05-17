package com.hexagonalexemplo.adaptadores.saida.entidades;

import com.hexagonalexemplo.dominio.entidades.Produto;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "produtos")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codigo;
    private String nome;
    private String preco;
    private String quantidade;

    public ProdutoEntity() {
    }

    public Produto toProduto() {
        return new Produto(this.codigo, this.nome, this.preco, this.quantidade);
    }

    public ProdutoEntity(Produto produto) {
        this.codigo = produto.getCodigo();
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();
    }
}
