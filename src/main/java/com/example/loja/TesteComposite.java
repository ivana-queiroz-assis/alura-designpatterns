package com.example.loja;

import com.example.loja.orcamento.ItemOrcamento;
import com.example.loja.orcamento.Orcamento;
import com.example.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteComposite {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("898")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("777")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
