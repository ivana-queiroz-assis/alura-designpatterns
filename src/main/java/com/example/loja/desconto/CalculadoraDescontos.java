package com.example.loja.desconto;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.efetuarCalculo(orcamento);
    }
}
