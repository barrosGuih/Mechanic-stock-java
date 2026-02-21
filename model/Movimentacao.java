package model;

import java.time.LocalDateTime;

public class Movimentacao {
    private Integer id;
    private int produtoId;
    private Integer quantidade;
    private String tipo;
    private LocalDateTime dataHora;

    public Movimentacao (Integer id, int produtoId, Integer quantidade, String tipo){
        this.id = id;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.dataHora = LocalDateTime.now();
    }

    public Integer getId(){
        return id;
    }

    public int getProdutoId(){
        return produtoId;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public String getTipo(){
        return tipo;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    @Override
    public String toString(){
       return dataHora + " | " + tipo + " | Produto ID: " + produtoId + " | Quantidade: " + quantidade;
    }
}
