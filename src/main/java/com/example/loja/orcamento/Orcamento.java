package com.example.loja.orcamento;

import com.example.loja.orcamento.situacao.EmAnalise;
import com.example.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;


public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private SituacaoOrcamento situacao;


    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reaprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }


    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
