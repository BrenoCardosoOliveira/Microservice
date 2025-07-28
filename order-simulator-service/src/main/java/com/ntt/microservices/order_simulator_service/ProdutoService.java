package com.ntt.microservices.order_simulator_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<Produto> buscarProdutos() {
        return webClientBuilder.build()
                .get()
                .uri("http://catalog-service/produtos")
                .retrieve()
                .bodyToFlux(Produto.class)
                .collectList()
                .block();
    }
}
