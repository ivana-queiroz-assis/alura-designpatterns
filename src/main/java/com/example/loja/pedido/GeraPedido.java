package com.example.loja.pedido;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrçamento;
    private int quantidadeItens;



    public GeraPedido(String cliente, BigDecimal valorOrçamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrçamento = valorOrçamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorOrçamento() {
        return valorOrçamento;
    }

    public void setValorOrçamento(BigDecimal valorOrçamento) {
        this.valorOrçamento = valorOrçamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}
