package org.example;

import java.util.ArrayList;
import java.util.List;

public class Artigo extends Conteudo {

    private List<Conteudo> conteudos;

    public Artigo(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Artigo: " + this.getDescricao() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}