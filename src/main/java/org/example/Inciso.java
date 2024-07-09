package org.example;

public class Inciso extends Conteudo {

    private int quantidadeIncisos;

    public Inciso(String descricao, int quantidadeIncisos) {
        super(descricao);
        this.quantidadeIncisos = quantidadeIncisos;
    }

    public int getQuantidadeIncisos() {
        return quantidadeIncisos;
    }

    public void setQuantidadeIncisos(int quantidadeIncisos) {
        this.quantidadeIncisos = quantidadeIncisos;
    }

    public String getConteudo() {
        return "Inciso: " + this.getDescricao() + " - quantidade Incisos: " + this.quantidadeIncisos + "\n";
    }

}