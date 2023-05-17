package com.hexagonalexemplo.infraestrutura.configuracao;

import com.hexagonalexemplo.dominio.portas.entrada.ProdutoServicePort;
import com.hexagonalexemplo.dominio.portas.saida.ProdutoRepositoryPort;
import com.hexagonalexemplo.dominio.service.ProdutoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    ProdutoServicePort produtoService(ProdutoRepositoryPort produtoRepositoryPort) {
        return new ProdutoService(produtoRepositoryPort);
    }
}
