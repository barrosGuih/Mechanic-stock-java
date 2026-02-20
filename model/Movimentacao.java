package model;

import java.time.LocalDateTime;

public class Movimentacao {
    private Integer id;
    private Produto produto;
    private Integer quantidade;
    private String tipo;
    private LocalDateTime dataHora;

    public Movimentacao (Integer id, Produto produto, Integer quantidade, String tipo){
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.dataHora = LocalDateTime.now();
    }

    public Integer getId(){
        return id;
    }

    @Override
    public String toString(){
        return dataHora + " | " + tipo + " | " +  produto.getNome() + " | Quantidade: " + quantidade;
        
    }
}
