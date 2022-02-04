package com.example.loja.orcamento;

import com.example.loja.DomainException;
import com.example.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento){
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado");
        }

        Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeItens", orcamento.getQuantidadeItens());
        httpAdapter.post("http://api.externa/orcamento", dados);
    }
}
