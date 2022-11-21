package com.padarialhada.padaria.service;

import com.padarialhada.padaria.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceProduto {
    final ProdutoRepository produtoRepository;

    public ServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
}
