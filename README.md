# Mechanic Stock – Sistema de Estoque Automotivo

## Descrição

O **Mechanic Stock** é um sistema simples de controle de estoque de peças e lubrificanteds do meio automotivo, desenvolvido em java com fins de ser utilizado em ambiente de trabalho para comprir e resolver necessidades especificas, 
Ele permite gerenciar entradas e saídas de produtos, controlar quantidades em estoque e registrar o histórico de movimentações.

## Funcionalidades

- Adicionar novos produtos ao estoque
- Registrar entrada de produtos
- Registrar saída de produtos
- Listar produtos disponíveis no estoque
- Visualizar histórico de movimentações (entrada/saída)

## Tecnologias

- Linguagem: **Java**
- Paradigma: **Orientação a Objetos**
- Estruturas de dados: `Map` e `List`
- Interface: **Terminal/Console**

## Estrutura do Projeto

    mechanicstock/
      ├─ src/
      │ ├─ model/
      │ │ ├─ Produto.java
      │ │ └─ Movimentacao.java
      │ ├─ service/
      │ │ └─ EstoqueService.java
      │ └─ Main.java
      ├─ README.md

## Como Compilar e Executar

1. Abra o terminal na raiz do projeto (`mechanicstock/`).

2. Compile todas as classes (Windows PowerShell):
   
       javac -cp "lib/mysql-connector-j-9.6.0.jar;." Main.java model\Produto.java dao\ProdutoDAO.java util\conexao\Conexao.java

Execute o programa:

       java -cp "lib/mysql-connector-j-9.6.0.jar;." Main

## Rodando...

        === Mechanic Stock ===

        Adicionar Produto

        Entrada de Produto

        Saída de Produto

        Listar Produtos

        Histórico de Movimentações

        Sair
        Escolha uma opção:


- Digite `1` para adicionar um novo produto.
- Digite `2` ou `3` para registrar entrada ou saída.
- Digite `4` para listar produtos atuais.
- Digite `5` para ver o histórico de movimentações.
