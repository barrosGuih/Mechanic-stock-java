package model;

public class Produto {
    private Integer id;
    private String nome;
    private Integer quantidade;

    public Produto(Integer id, String nome, Integer quantidade){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Integer getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Integer getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "ID: " + id + " | " + nome + " | Quantidade: " + quantidade;
    }
}
