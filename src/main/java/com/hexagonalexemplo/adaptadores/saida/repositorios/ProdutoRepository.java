package com.hexagonalexemplo.adaptadores.saida.repositorios;

import com.hexagonalexemplo.adaptadores.saida.entidades.ProdutoEntity;
import com.hexagonalexemplo.adaptadores.saida.persistencia.ProdutoPersistence;
import com.hexagonalexemplo.dominio.entidades.Produto;
import com.hexagonalexemplo.dominio.portas.saida.ProdutoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoRepository implements ProdutoRepositoryPort {

    private final ProdutoPersistence produtoPersistence;

    public ProdutoRepository(ProdutoPersistence produtoPersistence) {
        this.produtoPersistence = produtoPersistence;
    }

    @Override
    public List<Produto> buscarTodos() {
        List<ProdutoEntity> produtoEntities = this.produtoPersistence.findAll();
        return produtoEntities.stream().map(ProdutoEntity::toProduto).toList();
    }

    @Override
    public void salvar(Produto produto) {
        ProdutoEntity produtoEntity = new ProdutoEntity(produto);
        this.produtoPersistence.save(produtoEntity);
    }
}
