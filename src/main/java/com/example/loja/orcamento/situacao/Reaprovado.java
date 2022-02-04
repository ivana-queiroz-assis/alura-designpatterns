package com.example.loja.orcamento.situacao;

import com.example.loja.orcamento.Orcamento;

public class Reaprovado extends SituacaoOrcamento{

    @Override
    public void finalizar(Orcamento orcamento) {
      orcamento.setSituacao(new Finalizado());
    }
}
