package com.example.loja.pedido.acao;

import com.example.loja.pedido.Pedido;

public class LogPedido implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
