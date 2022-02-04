package com.example.loja;

import com.example.loja.http.JavaHttpClient;
import com.example.loja.orcamento.Orcamento;
import com.example.loja.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());

        registroOrcamento.registrar(orcamento);
    }
}
