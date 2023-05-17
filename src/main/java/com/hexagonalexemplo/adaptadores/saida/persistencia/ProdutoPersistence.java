package com.hexagonalexemplo.adaptadores.saida.persistencia;

import com.hexagonalexemplo.adaptadores.saida.entidades.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoPersistence extends JpaRepository<ProdutoEntity, UUID> {
}
