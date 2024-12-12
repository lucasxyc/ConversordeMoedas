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
            System.out.println("Digite o código da moeda de origem (EX: USD, BRL, EUR): ");
            String moedaOrigem = leitura.nextLine().toUpperCase();

            System.out.println("Digite o código da moeda de destino: (EX: EUR, BRL, USD): ");
            String moedaDestino = leitura.nextLine().toUpperCase();

            System.out.println("Digite um valor para a conversão: ");
            double valorParaConversao = leitura.nextDouble();

            System.out.println("Convertendo " + valorParaConversao + " " + moedaOrigem + " para " + moedaDestino);

            TaxasCambio taxas = servico.obterTaxasCambio(moedaDestino);
            double valorConvertido = ConversorMoeda.converter(valorParaConversao, moedaOrigem, moedaDestino, taxas);

            System.out.printf("O valor convertido é: %.2f %s\n", valorConvertido, moedaDestino);

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("O programa finalizou corretamente");
        }

    }
}

