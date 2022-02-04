package com.example.loja.imposto;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {

        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valoOutroImposto = BigDecimal.ZERO;
        if (outro!= null){
            valorImposto= outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valoOutroImposto);
    }
}
