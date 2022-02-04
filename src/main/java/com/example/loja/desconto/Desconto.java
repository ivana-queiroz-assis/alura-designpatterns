package com.example.loja.desconto;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }


    public abstract Boolean deveAplicar(Orcamento orcamento);

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
}
