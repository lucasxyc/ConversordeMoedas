package com.conversormoedas.util;

import com.conversormoedas.modelo.TaxasCambio;

public class ConversorMoeda {
    public static double converter(double valor, String moedaOrigem, String moedaDestino, TaxasCambio taxas) {

        if (!taxas.getTaxas().containsKey(moedaOrigem)) {
            throw new IllegalArgumentException("Moeda de origem inválida.");
        }

        if (!taxas.getTaxas().containsKey(moedaDestino)) {
            throw new IllegalArgumentException("Moeda de destino inválida.");
        }

        double taxaOrigem = taxas.getTaxas().get(moedaOrigem);
        double taxaDestino = taxas.getTaxas().get(moedaDestino);

        double taxaConversao = taxaDestino / taxaOrigem;

        return valor * taxaConversao;
    }
}
