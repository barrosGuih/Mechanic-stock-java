package service;

import dao.MovimentacaoDAO;
import model.ProdutoDAO;
import model.Movimentacao;

public class EstoqueService {

    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();

    public void entradaProduto(int produtoId, int quantidade) {
        produtoDAO.atualizarQuantidade(produtoId, quantidade);

        Movimentacao mov = new Movimentacao(
                null,
                produtoId,
                quantidade,
                "Entrada");

        movimentacaoDAO.inserir(mov);
    }

    public void saidaProduto(Int produtoId, Int quantidade) {
        int estoqueAtual = produtoDAO.buscarQuantidade(produtoId);

        if (estoqueAtual < quantidade) {
            if (p.getQuantidade() >= quantidade) {
                sytem.out.println("Estoque insuficiente");
                return;
            }
        }

        produto.DAO.atualizarQuantidade(produtoId, -quantidade);

        Movimentacao mov = new Movimentacao(
                null,
                produtoId,
                quantidade,
                "Saida");

        movimentacaoDAO.inserir(mov);
    }

    public void listarHistorico() {
        movimentacaoDAO.listar();
    }

}
