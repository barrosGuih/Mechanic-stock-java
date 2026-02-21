🛠️ Mechanic Stock – Sistema de Estoque Automotivo

📌 Descrição

O Mechanic Stock é um sistema de controle de estoque automotivo desenvolvido em Java, com o objetivo de gerenciar peças, lubrificantes, pneus e demais itens utilizados em oficinas mecânicas.

O projeto foi criado devido a demanda do dia a dia do trabalho e para fins academicos o projeto conta com foco em boas práticas de programação, utilizando arquitetura em camadas (MVC + DAO) e integração com banco de dados MySQL, permitindo o controle de entradas, saídas, estoque atual e histórico de movimentações.

🚀 Funcionalidades

➕ Cadastro de produtos (nome, quantidade, etc.)

📥 Registro de entrada de produtos no estoque

📤 Registro de saída de produtos do estoque

📦 Consulta do estoque atual

📜 Histórico completo de movimentações (entrada e saída)

💾 Persistência de dados com MySQL


🛠️ Tecnologias Utilizadas

Java

JDBC

MySQL

Paradigma: Orientação a Objetos

Arquitetura: MVC + DAO


📂 Estrutura do Projeto
mechanic-stock/
├─ src/
│  ├─ model/
│  │  ├─ Produto.java
│  │  └─ Movimentacao.java
│  ├─ dao/
│  │  ├─ ProdutoDAO.java
│  │  └─ MovimentacaoDAO.java
│  ├─ service/
│  │  └─ EstoqueService.java
│  ├─ util/
│  │  └─ conexao/
│  │     └─ Conexao.java
│  └─ Main.java
├─ lib/
│  └─ mysql-connector-j-9.6.0.jar
└─ README.md
🗄️ Banco de Dados

O projeto utiliza MySQL.
Certifique-se de criar o banco e as tabelas antes de executar o sistema.

Exemplo de tabelas:
CREATE DATABASE mechanic_stock;
USE mechanic_stock;

CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL
);

CREATE TABLE movimentacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    produto_id INT NOT NULL,
    quantidade INT NOT NULL,
    tipo VARCHAR(10) NOT NULL,
    data_hora DATETIME NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES produto(id)
);

▶️ Como Compilar e Executar

1️⃣ Acesse a pasta do projeto
cd mechanic-stock
2️⃣ Compile o projeto (Windows)
javac -cp "lib/mysql-connector-j-9.6.0.jar;." Main.java model\*.java dao\*.java service\*.java util\conexao\Conexao.java
3️⃣ Execute o sistema
java -cp "lib/mysql-connector-j-9.6.0.jar;." Main

🖥️ Menu do Sistema
== Mechanic Stock ==
1. Adicionar Produto
2. Entrada de Produto
3. Saída de Produto
4. Listar Estoque
5. Listar Histórico
0. Sair
Escolha uma opção:


📌 Status do Projeto

Em desenvolvimento
Novas funcionalidades e melhorias serão adicionadas.