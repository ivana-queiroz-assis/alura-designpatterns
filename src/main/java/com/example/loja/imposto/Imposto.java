package com.example.loja.imposto;

import com.example.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
   BigDecimal calcular(Orcamento orcamento);
}
