package com.example.loja;

import com.example.loja.imposto.CalculadoraImpostos;
import com.example.loja.imposto.ISS;
import com.example.loja.orcamento.Orcamento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class TesteCalculadora {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos.calcular(orcamento, new ISS()));
    }

}
