package com.example.loja;

import com.example.loja.imposto.CalculadoraImpostos;
import com.example.loja.imposto.ICMS;
import com.example.loja.imposto.ISS;
import com.example.loja.orcamento.ItemOrcamento;
import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto  {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

        System.out.println(calculadoraImpostos.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
