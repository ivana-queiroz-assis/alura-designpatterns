package com.example.loja.desconto;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisCincoItens  extends Desconto{


    public DescontoParaOrcamentoComMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
