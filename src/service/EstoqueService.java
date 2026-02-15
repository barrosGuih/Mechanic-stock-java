package src.service;

import src.model.Produto;
import src.model.Movimentacao;
import java.util.*;

public class EstoqueService {
    private Map<Integer, Produto> produtos = new HashMap<>();
    private List<Movimentacao> historico = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.put(produto.getId(), produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }
    
}
