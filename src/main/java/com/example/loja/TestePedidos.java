package com.example.loja;

import com.example.loja.pedido.GeraPedido;
import com.example.loja.pedido.GeraPedidoHandler;
import com.example.loja.pedido.acao.EnviarEmail;
import com.example.loja.pedido.acao.LogPedido;
import com.example.loja.pedido.acao.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {
       String cliente = "Ivana";
       BigDecimal valorOrcamento = new BigDecimal(300);
       int quantidadeItens = Integer.parseInt("2");

        GeraPedido geraPedido= new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBancoDados(), new EnviarEmail(), new LogPedido()));
        geraPedidoHandler.execute(geraPedido);

    }
}
