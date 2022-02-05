package com.example.loja;

import com.example.loja.desconto.CalculadoraDescontos;
import com.example.loja.imposto.CalculadoraImpostos;
import com.example.loja.imposto.ISS;
import com.example.loja.orcamento.ItemOrcamento;
import com.example.loja.orcamento.Orcamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class TesteDescontosLojaApplication {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));


        Orcamento terceiro = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.calcular(primeiro));
        System.out.println(calculadoraDescontos.calcular(segundo));
    }

}
