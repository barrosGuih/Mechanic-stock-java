# Mechanic Stock – Sistema de Estoque de Peças Automotivas

## Descrição

O **Mechanic Stock** é um sistema simples de controle de estoque de peças automotivas, desenvolvido em **Java puro** com fins didáticos.  
Ele permite gerenciar entradas e saídas de produtos, controlar quantidades em estoque e registrar o histórico de movimentações.

O projeto é ideal para praticar:
- **Programação Orientada a Objetos**
- Uso de **Map** e **List**
- Manipulação de dados via **terminal**

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
   
       javac -d . src\model\Produto.java src\model\Movimentacao.java src\service\EstoqueService.java src\Main.java

Execute o programa:

    java Main
