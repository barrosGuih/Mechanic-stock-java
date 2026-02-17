package model;

public class Empresa {
    private Integer id;
    private String nome;
    private Integer cnpj;

    public Empresa(Integer id, String nome, Integer cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCnpj() {
        return cnpj;
    }

}
