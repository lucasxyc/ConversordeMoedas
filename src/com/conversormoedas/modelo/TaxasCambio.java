package com.conversormoedas.modelo;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class TaxasCambio {
    @SerializedName("base_code")
    private String moedaBase;

    @SerializedName("conversion_rates")
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
