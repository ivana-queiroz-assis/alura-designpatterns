package com.example.loja.orcamento.situacao;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return  orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }
    @Override
    public void reaprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reaprovado());
    }

}
