package com.padarialhada.padaria.dtos;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class ProdutoDto {

    @NotBlank
    private String nome;

    @NotNull
    private Double valor;

    @NotNull
    private Integer quantidade;

    @NotBlank
    private String descricao;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
