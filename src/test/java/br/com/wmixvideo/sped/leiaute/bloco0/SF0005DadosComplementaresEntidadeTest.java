package br.com.wmixvideo.sped.leiaute.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class SF0005DadosComplementaresEntidadeTest {

    @Test
    public void deveGerarLinhaCompleta() {
        final SF0005DadosComplementaresEntidade linha = new SF0005DadosComplementaresEntidade()
                .setCampo02NomeFantasia("Empresa")
                .setCampo03Cep("88000000")
                .setCampo04Logradouro("AV Principal")
                .setCampo05Numero("5000")
                .setCampo06Complemento("compl")
                .setCampo07Bairro("CAMPINAS")
                .setCampo08Telefone("4844444444")
                .setCampo09Fax("4833333333")
                .setCampo10Email("teste@empresa.com.br");

        Assert.assertEquals("|0005|Empresa|88000000|AV Principal|5000|compl|CAMPINAS|4844444444|4833333333|teste@empresa.com.br|", linha.toString());
    }
}