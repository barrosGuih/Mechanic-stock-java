package service;

import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import model.Movimentacao;
import model.Produto;

public class EstoqueService {

    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();

    public void adicionarProduto(int id, String nome, int quantidade) {
        Produto produto = new Produto(id, nome, quantidade);
        produtoDAO.inserir(produto);
    }

    public void listarProdutos() {
        produtoDAO.listar();
    }

    public void entradaProduto(int produtoId, int quantidade) {
        Produto produto = produtoDAO.buscarPorId(produtoId);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        produtoDAO.atualizarQuantidade(produtoId, quantidade);

        Movimentacao mov = new Movimentacao(
                null,
                produtoId,
                quantidade,
                "ENTRADA"
        );

        movimentacaoDAO.inserir(mov);
    }

    public void saidaProduto(int produtoId, int quantidade) {
        Produto produto = produtoDAO.buscarPorId(produtoId);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        if (produto.getQuantidade() < quantidade) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        produtoDAO.atualizarQuantidade(produtoId, -quantidade);

        Movimentacao mov = new Movimentacao(
                null,
                produtoId,
                quantidade,
                "SAIDA"
        );

        movimentacaoDAO.inserir(mov);
    }

    public void listarHistorico() {
        movimentacaoDAO.listar();
    }
}