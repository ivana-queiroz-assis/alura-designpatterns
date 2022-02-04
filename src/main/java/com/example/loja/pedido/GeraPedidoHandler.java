package com.example.loja.pedido;

import com.example.loja.orcamento.Orcamento;
import com.example.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public void execute(GeraPedido geraPedido){
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrçamento(), geraPedido.getQuantidadeItens());
        String cliente = "Ivana Assis";
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }
}
