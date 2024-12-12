package com.conversormoedas.ui;

import com.conversormoedas.modelo.TaxasCambio;
import com.conversormoedas.servico.ServicoTaxasCambio;
import com.conversormoedas.util.ConversorMoeda;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ServicoTaxasCambio servico = new ServicoTaxasCambio();

        try {
            System.out.println("Digite o código da moeda base (EX: USD, BRL, EUR): ");
            String moedaBase = leitura.nextLine().toUpperCase();

            System.out.println("Digite o código da moeda de destino: (EX: EUR, BRL, USD");
            String moedaOrigem = leitura.nextLine().toUpperCase();

            System.out.println("Digite um valor para a conversão: ");
            double valorParaConversao = leitura.nextDouble();

            System.out.println("Convertendo " + valorParaConversao + " " + moedaBase + " para " + moedaOrigem);

            TaxasCambio taxas = servico.obterTaxasCambio(moedaOrigem);

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("O programa finalizou corretamente");
        }

    }
}

