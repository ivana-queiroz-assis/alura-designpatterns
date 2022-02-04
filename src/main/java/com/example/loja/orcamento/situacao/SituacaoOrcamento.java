package com.example.loja.orcamento.situacao;

import com.example.loja.DomainException;
import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reaprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser finalizado");
    }

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return  BigDecimal.ZERO;
    }
}
