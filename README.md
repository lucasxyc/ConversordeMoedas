# Conversor de Moedas

Bem-vindo ao Conversor de Moeda! Este projeto foi desenvolvido como parte do Challenge Conversor de Moeda, que integra a formação em programação da Alura na trilha ONE 7 - Oracle Next Education.

![image](https://github.com/user-attachments/assets/e184f89f-86fb-4991-a4ad-48990782b302)

## Funcionalidades

- **Conversão de Moedas:** Permite transformar valores entre diversas moedas utilizando a API ExchangeRate.

- **Atualização em Tempo Real:** Garante conversões baseadas nas taxas de câmbio mais recentes.

- **Gerenciamento de Erros:** Lida com entradas inválidas, falhas de conexão com a API via HTTPS e problemas na conversão de dados com Gson para manipulação de JSON.

## Como usar

**1. Escolha a moeda de origem:** Insira o código ISO 4217 da moeda que deseja converter. Exemplo: USD (dólar americano).

**2. Escolha a moeda de destino:** Insira o código ISO 4217 da moeda para a qual deseja realizar a conversão. Exemplo: BRL (real brasileiro).

**3. Insira o valor:** Informe o valor que deseja converter entre as moedas selecionadas.

**4. Após inserir o valor:** Após informar o valor, a ferramenta irá calcular o valor convertido e exibirá o resultado.

![image](https://github.com/user-attachments/assets/2cd81f46-c0de-4fb8-b4f1-9197d6f35093)

**OBS:** O padrão ISO 4217 é uma norma internacional que define códigos de três letras para representar as moedas de diferentes países e regiões. O objetivo é fornecer uma identificação única e padronizada para cada moeda, facilitando transações financeiras, câmbio de moedas e a comunicação global. O programa oferece suporte para todos os códigos.

Por exemplo:

    USD representa o dólar americano.
    BRL representa o real brasileiro.
    EUR representa o euro.

## Estrutura do projeto

- **Pacote config:** Contém a classe ConfiguracaoApi, responsável por configurar e gerenciar as conexões com a API utilizada para obter as taxas de câmbio.
  
- **Pacote modelo:** Contém a classe TaxasCambio, que representa os dados das taxas de câmbio obtidas da API.
  
- **Pacote servico:** Inclui a classe ServicoTaxasCambio, que implementa a lógica de negócios relacionada às chamadas à API ExchangeRate e ao processamento dos dados recebidos.
  
- **Pacote ui:** Abriga a classe Principal, que é o ponto de entrada do programa e gerencia a interface com o usuário e a execução geral do aplicativo.
  
- **Pacote util:** Inclui a classe ConversorMoeda, que é responsável por realizar operações auxiliares relacionadas à conversão de moedas, como cálculos ou transformações necessárias para o funcionamento do sistema.

## Requisitos

- Conexão com internet (necessário para a comunicação com a API).

- JDK 17 ou superior.

## Tecnologias Utilizadas

- **Java 17:**  A versão utilizada para o desenvolvimento do projeto, garantindo compatibilidade com as funcionalidades mais recentes e a estabilidade da versão LTS.

- **Gson:** Biblioteca utilizada para a conversão de objetos Java em JSON e vice-versa, facilitando o processamento dos dados obtidos da API.

- **API ExchangeRate:** Serviço utilizado para obter as taxas de câmbio em tempo real, permitindo a conversão entre diferentes moedas.

- **ChatGPT:** Utilizado para otimizar as descrições e melhorar a clareza e qualidade do conteúdo do projeto.
 
## Créditos

- **Desenvolvido por:** Lucas Nogueira

## Licença

MIT
