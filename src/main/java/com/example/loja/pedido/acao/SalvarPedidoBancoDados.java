package com.example.loja.pedido.acao;

import com.example.loja.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido{

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando dados do pedido no banco de dados.");
    }
}
