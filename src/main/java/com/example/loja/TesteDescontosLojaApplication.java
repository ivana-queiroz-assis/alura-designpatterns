package com.example.loja;

import com.example.loja.desconto.CalculadoraDescontos;
import com.example.loja.imposto.CalculadoraImpostos;
import com.example.loja.imposto.ISS;
import com.example.loja.orcamento.Orcamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class TesteDescontosLojaApplication {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.calcular(orcamento1));
        System.out.println(calculadoraDescontos.calcular(orcamento2));
    }

}
