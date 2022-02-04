package com.example.loja.imposto;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
