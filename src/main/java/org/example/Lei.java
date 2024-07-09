package org.example;

public class Lei {

    private Conteudo norma;

    public void setNorma(Conteudo norma) {
        this.norma = norma;
    }

    public String getNorma() {
        if (this.norma == null) {
            throw new NullPointerException("Lei sem Conteudo");
        }
        return this.norma.getConteudo();
    }
}