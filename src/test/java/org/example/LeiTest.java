package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeiTest {

    @Test
    void deveRetornarLeiComConteudo() {
        Artigo artigo1 = new Artigo("Art. 1º Esta Lei estabelece normas gerais de licitação:");

        Artigo artigo2 = new Artigo("Art. 2º Esta Lei aplica-se a:");
        Inciso inciso21 = new Inciso("I - os órgãos dos Poderes Legislativo e Judiciário da União, dos Estados e do Distrito Federal e os órgãos do Poder Legislativo dos Municípios, quando no desempenho de função administrativa;", 2);
        artigo2.addConteudo(inciso21);

        Artigo artigo3 = new Artigo("Art. 3º Não se subordinam ao regime desta Lei:");
        Inciso inciso31 = new Inciso("I - condições decorrentes de acordos internacionais aprovados pelo Congresso Nacional e ratificados pelo Presidente da República;", 3);
        Inciso inciso32 = new Inciso("II - condições peculiares à seleção e à contratação constantes de normas e procedimentos das agências ou dos organismos, desde que:" ,4);
        artigo3.addConteudo(inciso31);
        artigo3.addConteudo(inciso32);

        Artigo norma = new Artigo("Lei de Licitações");
        norma.addConteudo(artigo1);
        norma.addConteudo(artigo2);
        norma.addConteudo(artigo3);

        Lei lei = new Lei();
        lei.setNorma(norma);

        assertEquals("Artigo: Lei de Licitações\n" +
                "Artigo: Art. 1º Esta Lei estabelece normas gerais de licitação:\n" +
                "Artigo: Art. 2º Esta Lei aplica-se a:\n" +
                "Inciso: I - os órgãos dos Poderes Legislativo e Judiciário da União, dos Estados e do Distrito Federal e os órgãos do Poder Legislativo dos Municípios, quando no desempenho de função administrativa; - quantidade Incisos: 2\n" +
                "Artigo: Art. 3º Não se subordinam ao regime desta Lei:\n" +
                "Inciso: I - condições decorrentes de acordos internacionais aprovados pelo Congresso Nacional e ratificados pelo Presidente da República; - quantidade Incisos: 3\n" +
                "Inciso: II - condições peculiares à seleção e à contratação constantes de normas e procedimentos das agências ou dos organismos, desde que: - quantidade Incisos: 4\n", lei.getNorma());
    }

    @Test
    void deveRetornarLeiSemConteudo() {
        try {
            Lei lei = new Lei();
            lei.getNorma();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Lei sem Conteudo", e.getMessage());
        }
    }
}