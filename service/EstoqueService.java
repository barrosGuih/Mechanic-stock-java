package service;

import model.Produto;
import model.Movimentacao;
import java.util.*;

public class EstoqueService {
    private Map<Integer, Produto> produtos = new HashMap<>();
    private List<Movimentacao> historico = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.put(produto.getId(), produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public void entradaProduto(Integer id, Integer quantidade){
        Produto p = produtos.get(id);
        if( p != null){
            p.setQuantidade(p.getQuantidade() + quantidade);
            historico.add(new Movimentacao(p, quantidade,"Entrada"));
            System.out.println("Entrada registrada.");
        } else{
            System.out.println("Produto nao encontrado");
        }
    }

    public void saidaProduto(Integer id, Integer quantidade){
        Produto p = produtos.get(id);
        if(p != null){
            if(p.getQuantidade() >= quantidade) {
                p.setQuantidade(p.getQuantidade() - quantidade);
                historico.add(new Movimentacao(p, quantidade, "Saida"));
                System.out.println("Saida registrada");
            } else{
                System.out.println("Quantidade insuficiente em estoque");
            }   
        } else{
            System.out.println("Produto nao encontrado");
        }
    }

    public void listarProdutos(){
        System.out.println("== Produtos em Estoque ==");
        for(Produto p: produtos.values()){
            System.out.println(p);
        }
    }

    public void listarHistorico(){
        System.out.println("== Historico de Movimentacao ==");
        for(Movimentacao m : historico){
            System.out.println(m);
        }
    }
    
}
