package com.conversormoedas.servico;

import com.conversormoedas.config.ConfiguracaoApi;
import com.conversormoedas.modelo.TaxasCambio;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoTaxasCambio {
    private final HttpClient clienteHttp = HttpClient.newHttpClient();

    public TaxasCambio obterTaxasCambio(String moedaBase) throws IOException, InterruptedException {
        String endereco = ConfiguracaoApi.url_Base + moedaBase;

        HttpRequest requisicaoMoedaBase = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

        HttpResponse<String> respostaMoedaBase = clienteHttp.send(requisicaoMoedaBase, HttpResponse.BodyHandlers.ofString());

        if (respostaMoedaBase.statusCode() != 200) {
            throw new RuntimeException("Erro ao acessar a API. Código: " + respostaMoedaBase.statusCode());
        }

        Gson conversorJson = new Gson();
        TaxasCambio taxasCambio = conversorJson.fromJson(respostaMoedaBase.body(), TaxasCambio.class);

        if (taxasCambio.getTaxas() == null) {
            throw new RuntimeException("As taxas de câmbio não foram retornadas corretamente.");
        }
        return taxasCambio;
    }
}
