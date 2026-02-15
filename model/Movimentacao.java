package model;

import java.time.LocalDateTime;

public class Movimentacao {
    private Produto produto;
    private Integer quantidade;
    private String tipo;
    private LocalDateTime dataHora;

    public Movimentacao (Produto produto, Integer quantidade, String tipo){
        this.produto = produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public String toString(){
        return dataHora + " | " + tipo + " | " +  produto.getNome() + " | Quantidade: " + quantidade;
        
    }
}
