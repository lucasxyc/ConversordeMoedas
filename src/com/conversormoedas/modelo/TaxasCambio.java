package com.conversormoedas.modelo;

import java.util.Map;

public class TaxasCambio {
    private String moedaBase;
    private Map<String, Double> taxas;

    public Map<String, Double> getTaxas() {
        return taxas;
    }

    public void setTaxas(Map<String, Double> taxas) {
        this.taxas = taxas;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }
}
