package com.example.loja.pedido.acao;

import com.example.loja.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {



    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar dados do pedido por email.");
    }
}
